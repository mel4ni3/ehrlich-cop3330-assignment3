/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ex41;

import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        int name_count = 0;
        ArrayList<String> str = new ArrayList<String>();

        Scanner inFile = new Scanner(new File("src\\main\\java\\ex41\\exercise41_input.txt"));
        FileWriter outFile = new FileWriter("src\\main\\java\\ex41\\exercise41_output.txt");

        // Populate Arraylist & sort
        while (inFile.hasNextLine()) {
            str.add(inFile.nextLine());
            name_count++;
        }
        Collections.sort(str);
        inFile.close();

        // Print & write to file
        outFile.write("Total of " + name_count + " names" + "\n");
        outFile.write("-----------------" + "\n");
        for(int i = 0; i < name_count; i++){
            outFile.write(str.get(i) + "\n");
        }
        outFile.close();

    }
}