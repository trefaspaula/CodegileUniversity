package com.codegile.paula.week3.day2.problem3iulian;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public static void main(String[] args) {
        List<MyThread> threadList = new ArrayList<>();
        threadList.add(new MyThread("Thread 0", null));
        for (int i = 1; i < 50; i++)
            threadList.add(new MyThread("Thread " + Integer.toString(i)
                    , threadList.get(i - 1)));

        threadList.get(0).start();
    }


}
