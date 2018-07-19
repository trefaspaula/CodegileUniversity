package com.codegile.paula.week3.day2.problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Thread t = new Thread(new Counter());
        t.start();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        if (bf.read() == '\n') {
            try {
                System.out.println(t.getState());
                Thread.sleep(3000);
                t.interrupt();
                System.out.println(t.getState());
            } catch (InterruptedException e) {


            }
        }


    }
}
