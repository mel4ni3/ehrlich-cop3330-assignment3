/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ex46;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void printOutput() {
    }

    @Test
    void main() {
        // check that input file exists
        File inputFile = new File("src\\main\\java\\ex46\\exercise46_input.txt");
        assertTrue(inputFile.exists());
    }
}