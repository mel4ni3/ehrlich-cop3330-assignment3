/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ex42;

import java.util.*;
import java.io.File;
import java.io.IOException;

// employee class
class Employee {

    // public fields
    String last;
    String first;
    int salary;

    // Parameterized constructor to create new employees
    public Employee(String first, String last, int salary) {
        this.first = first;
        this.last = last;
        this.salary = salary;
    }

    // method to print the employee's information in the specified output format
    public void printLine() {
        System.out.format("%-10s%-10s%5d\n", this.first, this.last, this.salary);
    }

}

public class App {

    public static void main(String[] args) throws IOException {


        Scanner inFile = new Scanner(new File("src\\main\\java\\ex42\\exercise42_input.txt"));

        System.out.println("Last      First     Salary");
        System.out.println("--------------------------");
        for (int i = 0; i < 7; i++) {
            String line = inFile.nextLine();
            String[] split = line.split(",");
            String last = split[0];
            String first = split[1];
            int salary = Integer.parseInt(split[2]);
            Employee employee = new Employee(last, first, salary);
            employee.printLine();
        }

        inFile.close();
    }
}