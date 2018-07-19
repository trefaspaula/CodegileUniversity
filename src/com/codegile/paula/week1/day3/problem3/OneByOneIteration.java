package com.codegile.paula.week1.day3.problem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class OneByOneIteration<T> implements Iterator {
    private List<T> obj;
    private int next;

    public OneByOneIteration() {
        obj = new ArrayList<>();
        next = 0;

    }

    public List<T> getObj() {
        return obj;
    }

    public void setObj(List<T> obj) {
        this.obj = obj;
    }

    public boolean hasNext() {
        if (next < obj.size())
            return true;
        else
            return false;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer action) {

    }

    @Override
    public T next() {
        return obj.get(next++);

    }

    public void Iteration(List<T> obj) {
        while (hasNext()) {
            System.out.print(next() + " ");
        }
    }
}
