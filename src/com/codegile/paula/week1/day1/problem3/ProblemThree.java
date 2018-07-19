package com.codegile.paula.week1.day1.problem3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProblemThree {
    public static List<String> read(String nameFile) {
        File f = new File(nameFile);
        List<String> words = new ArrayList<>();

        try {
            Scanner sc = new Scanner(f);
            sc.useDelimiter(";");

            while (sc.hasNext()) {
                words.add(sc.next());
            }
        } catch (IOException ex) {

        }
        return words;
    }

    public static void sort(List<String> words) {
        Collections.sort(words);
    }

    public static List<String> test(List<String> words, String vowels) {
        List<String> newWords = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if (vowels.contains(words.get(i).substring(0, 1))) {
                newWords.add(Integer.toString(words.get(i).length()));

            } else {
                newWords.add(words.get(i));
            }

        }
        return newWords;

    }

    public static void print(List<String> word) {
        for (int i = 0; i < word.size(); i++) {
            System.out.print(word.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        List<String> words = read("word.txt");
        sort(words);
        print(words);
        System.out.println();
        String vowels = "AEIOUaeiou";
        List<String> newWords = test(words, vowels);
        print(newWords);

    }
}
