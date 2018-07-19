package com.codegile.paula.week1.day3.problem3;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        OneByOneIteration first = new OneByOneIteration();
        List<String> nr = new ArrayList<>();
        nr.add("a");
        nr.add("b");
        nr.add("c");
        nr.add("d");
        nr.add("f");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(9);
        numbers.add(12);
        numbers.add(100);
//        first.setObj(nr);
//        TwoByTwoIteration second=new TwoByTwoIteration();
//        second.setObj(nr);
//        second.Iteration(second.getObj());
        FirstAndLastIteration last = new FirstAndLastIteration();
        last.setObj(numbers);
        last.Iteration(last.getObj());
        //first.Iteration(first.getObj());


    }
}
