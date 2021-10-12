/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Melanie Ehrlich
 */


package ex45;

import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class App {

    public static void main(String[] args) throws IOException {

        String fileContent = Files.readString(Path.of("src\\main\\java\\ex45\\exercise45_input.txt"), StandardCharsets.US_ASCII);
        fileContent = fileContent.replaceAll("utilize", "use");

        Scanner input = new Scanner(System.in);
        System.out.println("What is the name of the output file? Do not include the file extension.");
        String name = input.nextLine();
        FileWriter outFile = new FileWriter("src\\main\\java\\ex45\\"+name+".txt");
        outFile.write(fileContent);
        outFile.close();

    }

}
