package com.codegile.paula.week1.day3.problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortMethods {

    public List<Integer> numbers(Integer interval) {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(interval));
        }
        return numbers;
    }

    public List<Integer> bubbleSort(List<Integer> numbers) {
        int aux = 0;
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) > numbers.get(j)) {
                    aux = numbers.get(j);
                    numbers.remove(j);
                    numbers.add(j, numbers.get(i));
                    numbers.remove(i);
                    numbers.add(i, aux);
                }
            }
        }
        return numbers;
    }

    public Integer getPivot(List<Integer> numbers, Integer first, Integer last) {
        int i = first;
        int j = last;
        int x = numbers.get((i + j) / 2);
        int aux;
        while (i < j) {
            while ((i < last) && (numbers.get(i) < x)) i++;
            while ((j > first) && (numbers.get(j) > x)) j--;
            if (i <= j) {
                Collections.swap(numbers, i, j);
                i++;
                j--;
            }
        }
        return i;

    }

    public List<Integer> quickSort(List<Integer> numbers, Integer first, Integer last) {
        int piv = getPivot(numbers, first, last);
        if (first < piv - 1) {
            quickSort(numbers, first, piv - 1);
        }
        if (piv < last) {
            quickSort(numbers, piv, last);
        }
        return numbers;
    }

    public void print(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
