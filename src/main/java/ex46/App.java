/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

package ex46;

import java.util.*;
import java.io.File;
import java.io.IOException;


class Word {
    String word;
    int freq;

    public Word(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }
}

public class App {

    public static void printOutput(ArrayList<Word> allWords){

        for(int i = 0; i < allWords.size() - 1 ; i++) {
            if (allWords.get(i).freq != 0) {
                System.out.print("\n" + allWords.get(i).word + ": ");

                for (int j = 0; j < allWords.get(i).freq; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner inFile = new Scanner(new File("src\\main\\java\\ex46\\exercise46_input.txt"));

        ArrayList<Word> allWords = new ArrayList<>();

        // read all values from the file
        String str = inFile.next();
        Word newWord = new Word(str, 1);
        allWords.add(newWord);

        while(inFile.hasNext()) {
            str = inFile.next();
            for(int i = 0; i < allWords.size(); i++) {
                // see if word is already in arraylist
                if (allWords.get(i).word.equals(str)) {
                    allWords.set(i, new Word(allWords.get(i).word, allWords.get(i).freq + 1));
                    break;
                }
                else {
                    newWord = new Word(str, 0);
                    allWords.add(newWord);
                }
            }
        }
        printOutput(allWords);
        inFile.close();
    }
}