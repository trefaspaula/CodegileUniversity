package com.codegile.paula.week2.day3.problem2;

public class Employee {
    private Integer id;
    private String firstName;
    private String lastName;
    private String CNP;
    private Double salary;

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public String getCNP() {
        return CNP;
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

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
