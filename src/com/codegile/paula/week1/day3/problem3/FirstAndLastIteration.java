package com.codegile.paula.week1.day3.problem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class FirstAndLastIteration<T> implements Iterator {
    List<T> obj;
    int first;
    int last;
    boolean isFirst;

    public FirstAndLastIteration() {
        obj = new ArrayList<>();
        first = 0;
        isFirst = true;

    }

    public List<T> getObj() {
        return this.obj;
    }

    public void setObj(List<T> obj) {
        this.obj = obj;
        last = obj.size() - 1;
    }

    public boolean hasNext() {
        if (first <= last)
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
        if (isFirst == true) {
            isFirst = false;
            return obj.get(first++);
        } else {
            isFirst = true;
            return obj.get(last--);
        }
    }

    public void Iteration(List<T> obj) {
        while (hasNext() == true) {
            System.out.print(this.next() + " ");
        }
    }


}
