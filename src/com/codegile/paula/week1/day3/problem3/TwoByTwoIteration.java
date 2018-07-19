package com.codegile.paula.week1.day3.problem3;

import java.util.ArrayList;
import java.util.List;

public class TwoByTwoIteration<T> {
    private List<T> obj;
    private int next;

    public TwoByTwoIteration() {
        obj = new ArrayList<>();
        next = 0;

    }

    public List<T> getObj() {
        return this.obj;
    }

    public void setObj(List<T> obj) {
        this.obj = obj;
    }

    public int hasNext() {
        if (next < obj.size())
            return 1;
        else
            return 0;
    }

    public T nextIt() {
        int n = next;
        next += 2;
        return obj.get(n);

    }

    public void Iteration(List<T> obj) {
        while (hasNext() == 1) {
            System.out.print(nextIt() + " ");
        }
    }
}


