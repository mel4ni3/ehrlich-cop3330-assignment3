/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Melanie Ehrlich
 */


package ex41;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void main() throws FileNotFoundException {
        File inputFile = new File("src\\main\\java\\ex41\\exercise41_input.txt");
        assertTrue(inputFile.exists());

        File outputFile = new File("src\\main\\java\\ex41\\exercise41_output.txt");
        assertTrue(outputFile.exists());

        // check if input file is not empty
        assertTrue(inputFile.length() != 0);

        // check if output file is not empty
        assertTrue(outputFile.length() != 0);
    }
}