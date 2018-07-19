package com.codegile.paula.week1.day3.problem2;

public class Main {
    public static void main(String[] args) {
        Verification ver = new Verification();
        String content = ver.readFile("parenthesis.txt");
        System.out.println(content);
        System.out.print(ver.test(content));
    }
}
