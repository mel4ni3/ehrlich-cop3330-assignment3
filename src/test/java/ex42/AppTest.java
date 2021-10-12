/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Melanie Ehrlich
 */


package ex42;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void main() {
        // check if input file exists
        File inputFile = new File("src\\main\\java\\ex42\\exercise42_input.txt");
        assertTrue(inputFile.exists());

        // check if input file is not empty
        assertTrue(inputFile.length() != 0);
    }
}