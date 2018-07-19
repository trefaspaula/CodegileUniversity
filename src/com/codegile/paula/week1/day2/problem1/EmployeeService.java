package com.codegile.paula.week1.day2.problem1;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {

    public List<Employee> sortEmploys(List<Employee> employee) {
        Collections.sort(employee, new SortEmploys());
        return employee;
    }

    public Employee read() {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        String employee = sc.nextLine();
        String[] employs = employee.split(" ");
        emp.setId(Integer.parseInt(employs[0]));
        emp.setFirstName(employs[1]);
        emp.setLastName(employs[2]);
        emp.setSSN(employs[3]);
        return emp;
    }

    public void create(Employee employee, List<Employee> employs) {
        employs.add(employee);
    }

    public void update(Employee employee) {
        employee.setFirstName("Popescu");
    }

    public void delete(List<Employee> employ, Employee employee) {
        employ.remove(employee);
    }
}
