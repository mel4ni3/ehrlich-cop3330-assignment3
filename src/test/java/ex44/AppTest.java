/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Melanie Ehrlich
 */


package ex44;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void isProduct() {

    }

    @Test
    void checkProduct() {
    }

    @Test
    void main() {
        // check if input file exists
        File JSONFile = new File("src\\main\\java\\ex44\\exercise44_input.txt");
        assertTrue(JSONFile.exists());

        // check if input file is not empty
        assertTrue(JSONFile.length() != 0);
    }
}