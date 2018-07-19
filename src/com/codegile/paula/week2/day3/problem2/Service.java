package com.codegile.paula.week2.day3.problem2;

import com.codegile.paula.week1.day2.problem1.InvalidDataException;

import java.util.List;

public interface Service {
    public List<Employee> create(Employee employee, List<Employee> employs) throws InvalidDataException;

    public Employee read() throws InvalidDataException;

    public void update(Employee e) throws InvalidDataException;

    public void delete(List<Employee> employees, Employee employee) throws InvalidDataException;
}
