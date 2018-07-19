package com.codegile.paula.week1.day2.problem1;

import java.util.Calendar;
import java.util.List;

public class Employee {
    private Integer id;
    private String firstName;
    private String lastName;
    private String SSN;

    public Employee(Integer id, String firstName, String lastName, String SSN) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public Employee() {

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public List<Employee> addEmploys(List<Employee> employee) {
        employee.add(new Employee(1, "Constantin", "Ioana", "2840612785410"));
        employee.add(new Employee(3, "Pavel", "Vasile", "1800417785412"));
        employee.add(new Employee(5, "Iachim", "Rares", "1930214745986"));
        employee.add(new Employee(7, "Istrate", "Maria", "2910518731982"));
        return employee;
    }

    public void print(List<Employee> employee) {
        for (int i = 0; i < employee.size(); i++) {
            System.out.println(employee.get(i).getId() + " " + employee.get(i).getFirstName() + " " + employee.get(i).getLastName() + " " + employee.get(i).getSSN());
        }
    }

    public Integer getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - (1900 + Integer.parseInt(SSN.substring(1, 3)));
    }
}
