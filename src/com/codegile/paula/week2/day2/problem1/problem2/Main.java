package com.codegile.paula.week2.day2.problem1.problem2;

import com.codegile.paula.week2.day2.problem1.problem2.model.Employee;
import com.codegile.paula.week2.day2.problem1.problem2.service.Service;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        List<Employee> employees = service.read("employees.txt");
        service.print(employees);
        List<Employee> employees1 = service.sort(employees);
        service.print(employees1);
        List<Employee> modifyDirector = service.modifySalaryDirector(employees);
        //service.print(modifyDirector);
        List<Employee> modifyManager = service.modifySalaryWomenManager(employees, 100);
        //service.print(modifyManager);
        //service.printDirectorOverThirty(employees);

    }
}
