package com.codegile.paula.week1.day3.problem1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SortMethods srt = new SortMethods();
        List<Integer> numbersFirst = srt.numbers(100);
        List<Integer> numbersSecond = numbersFirst;
        srt.print(numbersFirst);
        //List<Integer>sort=srt.bubbleSort(numbersFirst);
        List<Integer> sort = srt.quickSort(numbersSecond, 0, numbersSecond.size() - 1);
        System.out.println();
        srt.print(sort);


    }
}
