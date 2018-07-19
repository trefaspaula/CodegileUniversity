package com.codegile.paula.week1.day3.problem2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Verification {
    public String readFile(String nameFile) {
        File f = new File(nameFile);

        String content = "";

        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                content = sc.nextLine();
            }

        } catch (IOException ex) {

        }
        return content;
    }

    public int test(String parenthesis) {
        Stack<String> par = new Stack<>();
        Boolean ok = true;
        if (parenthesis.substring(0, 1).equals(")"))
            return 0;
        else
            par.push(parenthesis.substring(0, 1));
        for (int i = 1; i < parenthesis.length(); i++) {
            if (parenthesis.substring(i, i + 1).equals("("))
                par.push(parenthesis.substring(i, i + 1));
            else
                par.pop();

        }
        if (par.isEmpty())
            return 1;
        else
            return 0;
    }
}
