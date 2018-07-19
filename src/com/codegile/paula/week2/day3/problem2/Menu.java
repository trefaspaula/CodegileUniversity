package com.codegile.paula.week2.day3.problem2;

import com.codegile.paula.week1.day2.problem1.InvalidDataException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        while (!(line.equals("stop"))) {

            switch (line) {
                case "c":
                    try {
                        employees = service.create(employee, employees);
                        service.printList(employees);
                    } catch (InvalidDataException ex) {
                        ex.getMessage();
                    }
                    break;
                case "r":
                    try {
                        employee = service.read();
                        service.printEmployee(employee);
                    } catch (InvalidDataException ex) {
                        ex.getMessage();
                    }
                    break;
                case "u":
                    try {
                        service.update(employee);
                        service.printList(employees);
                    } catch (InvalidDataException ex) {
                        ex.getMessage();
                    }
                    break;
                case "d":
                    try {
                        service.delete(employees, employee);
                        service.printList(employees);
                    } catch (InvalidDataException ex) {
                        ex.getMessage();
                    }
                    service.printList(employees);
            }
            line = sc.nextLine();
        }
    }
}
