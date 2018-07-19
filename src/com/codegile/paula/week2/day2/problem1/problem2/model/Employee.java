package com.codegile.paula.week2.day2.problem1.problem2.model;

public class Employee {
    private Integer id;
    private String name;
    private String CNP;
    private Double salary;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCNP() {
        return CNP;
    }

    public Double getSalary() {
        return salary;
    }

}
