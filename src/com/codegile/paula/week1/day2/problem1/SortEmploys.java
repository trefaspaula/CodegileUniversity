package com.codegile.paula.week1.day2.problem1;

import java.util.Comparator;

public class SortEmploys implements Comparator<Employee> {
    @Override
    public int compare(Employee first, Employee second) {

        return (int) first.getAge() - second.getAge();
    }
}
