package com.codegile.paula.week1.day1.problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class ProblemOne {
    public static ArrayList<Integer> readNumbers(Integer n) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        return numbers;

    }

    public static void test(ArrayList<Integer> allNumbers, NumberType number) {

        for (int i = 0; i < allNumbers.size(); i++) {
            if (allNumbers.get(i) % 2 == 0) {
                number.setOdd(number.getOdd() + 1);
            } else {
                number.setEven(number.getEven() + 1);
            }
        }
    }

    public static void print(NumberType nr) {
        System.out.print(nr.getOdd() + " " + nr.getEven());
    }

    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        ArrayList<Integer> allNumbers = readNumbers(size);
        NumberType nr = new NumberType();
        test(allNumbers, nr);
        print(nr);


    }
}
