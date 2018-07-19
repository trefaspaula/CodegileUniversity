package com.codegile.paula.week2.day3.problem2;

import com.codegile.paula.week1.day2.problem1.InvalidDataException;

import java.util.List;
import java.util.Scanner;

public class ServiceImpl implements Service {
    @Override
    public List<Employee> create(Employee employee, List<Employee> employs) throws InvalidDataException {
        if (employee.getSalary() > 500)
            employs.add(employee);
        else {
            throw new InvalidDataException("Angajatul are un salariu prea mic");
        }
        return employs;
    }

    @Override
    public Employee read() throws InvalidDataException {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        String employee = sc.nextLine();
        String[] employs = employee.split(" ");
        emp.setId(Integer.parseInt(employs[0]));
        emp.setFirstName(employs[1]);
        emp.setLastName(employs[2]);
        emp.setCNP(employs[3]);
        emp.setSalary(Double.parseDouble(employs[4]));
        if ((employs[3].length() == 13))
            return emp;
        else
            throw new InvalidDataException("Scrie incorecta");


    }

    @Override
    public void update(Employee e) throws InvalidDataException {
        if (e.getCNP().substring(0, 1).equals("1") || e.getCNP().substring(0, 1).equals("2"))
            e.setFirstName("Popescu");
        else
            throw new InvalidDataException("CNP invalid");
    }

    @Override
    public void delete(List<Employee> employees, Employee employee) throws InvalidDataException {
        if (!(employee.getFirstName().equals("Trefas")))
            employees.remove(employee);
        else {
            throw new InvalidDataException("Angajatul este imposibil de sters");
        }
    }

    public void printList(List<Employee> employees) {
        for (Employee e : employees) {
            System.out.println(e.getId() + " " + e.getFirstName() +
                    " " + e.getLastName() + " " + e.getCNP() + " " + e.getSalary());
        }
    }

    public void printEmployee(Employee e) {
        System.out.println(e.getId() + " " + e.getFirstName() +
                " " + e.getLastName() + " " + e.getCNP() + " " + e.getSalary());
    }

}
