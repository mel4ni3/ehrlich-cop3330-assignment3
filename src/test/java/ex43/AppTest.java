/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Melanie Ehrlich
 */


package ex43;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void createWebsite(String name) throws FileNotFoundException {

        File siteFile = new File("./website/"+name+"/index.html");
        assertTrue(siteFile.exists());

        Path path = Paths.get("./website/"+name);
        assertTrue(Files.exists(path));
    }

    @Test
    void createJavaScript(String name) {
        Path path = Paths.get("./website/"+name+"/js");
        assertTrue(Files.exists(path));
    }

    @Test
    void createCSS(String name) {
        Path path = Paths.get("./website/"+name+"/css");
        assertTrue(Files.exists(path));
    }

}