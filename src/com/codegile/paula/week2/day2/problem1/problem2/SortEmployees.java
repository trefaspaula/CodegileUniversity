package com.codegile.paula.week2.day2.problem1.problem2;

import com.codegile.paula.week2.day2.problem1.problem2.model.Employee;
import com.codegile.paula.week2.day2.problem1.problem2.model.Manager;

import java.util.Comparator;

public class SortEmployees implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1 instanceof Manager && o2 instanceof Manager)
            return (int) (o1.getSalary() - o2.getSalary());
        return 0;
    }

}
