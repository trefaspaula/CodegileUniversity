package com.codegile.paula.week2.day2.problem1.problem2.service;

import com.codegile.paula.week2.day2.problem1.problem2.SortEmployees;
import com.codegile.paula.week2.day2.problem1.problem2.model.*;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Service {
    public List<com.codegile.paula.week2.day2.problem1.problem2.model.Employee> read(String nameFile) {
        List<com.codegile.paula.week2.day2.problem1.problem2.model.Employee> employees = new ArrayList<>();
        File f = new File(nameFile);
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String type = sc.nextLine();
                switch (EmployeeType.valueOf(type)) {
                    case DIRECTOR:
                        Director bon = new Director();
                        String bonus = sc.nextLine();
                        String[] split = bonus.split(" ");
                        bon.setBudget(Double.parseDouble(split[4]));
                        bon.setId(Integer.parseInt(split[0]));
                        bon.setName(split[1]);
                        bon.setCNP(split[2]);
                        bon.setSalary(Double.parseDouble(split[3]));
                        employees.add(bon);

                        break;
                    case ADMIN:
                        Admin admin = new Admin();
                        String bonu = sc.nextLine();
                        String[] spli = bonu.split(" ");
                        admin.setId(Integer.parseInt(spli[0]));
                        admin.setName(spli[1]);
                        admin.setCNP(spli[2]);
                        admin.setSalary(Double.parseDouble(spli[3]));
                        employees.add(admin);
                        break;
                    case MANAGER:
                        Manager manager = new Manager();
                        String s = sc.nextLine();
                        String[] split1 = s.split(" ");
                        manager.setId(Integer.parseInt(split1[0]));
                        manager.setName(split1[1]);
                        manager.setCNP(split1[2]);
                        manager.setSalary(Double.parseDouble(split1[3]));
                        manager.setDepositName(split1[4]);
                        employees.add(manager);
                        break;
                    case ENGINEER:
                        Engineer engineer = new Engineer();
                        String se = sc.nextLine();
                        String[] split2 = se.split(" ");
                        engineer.setId(Integer.parseInt(split2[0]));
                        engineer.setName(split2[1]);
                        engineer.setCNP(split2[2]);
                        engineer.setSalary(Double.parseDouble(split2[3]));
                        employees.add(engineer);
                }
            }

        } catch (IOException ex) {

        }
        return employees;
    }

    public void print(List<Employee> emp) {
        for (com.codegile.paula.week2.day2.problem1.problem2.model.Employee e : emp) {
            if (e instanceof Manager) {
                Manager manager = (Manager) e;
                System.out.println(manager.getId() + " " + manager.getName() + " " +
                        manager.getCNP() + " " + manager.getSalary() + " " + manager.getDepositName());
            }
            if (e instanceof Director) {
                Director director = (Director) e;
                System.out.println(director.getId() + " " + director.getName() + " " +
                        director.getCNP() + " " + director.getSalary() + " " +
                        director.getBudget());

            }
            if (e instanceof Admin || e instanceof Engineer) {
                System.out.println(e.getId() + " " + e.getName() + " " +
                        e.getCNP() + " " + e.getSalary());
            }
        }
    }

    public List<Employee> sort(List<Employee> employees) {
        Collections.sort(employees, new SortEmployees());
        return employees;
    }

    public List<Employee> modifySalaryDirector(List<Employee> employees) {
        for (com.codegile.paula.week2.day2.problem1.problem2.model.Employee e : employees) {
            if (e instanceof Director) {
                Director director = (Director) e;
                e.setSalary(e.getSalary() + (director.getBudget() / 2));
            }
        }
        return employees;
    }

    public String getSex(Employee e) {
        if (e.getCNP().substring(0, 1).equals("1"))
            return "M";
        else
            return "F";

    }

    public Integer getAge(Employee e) {
        return Calendar.getInstance().get(Calendar.YEAR) - (1900 + Integer.parseInt(e.getCNP().substring(1, 3)));
    }

    public List<Employee> modifySalaryWomenManager(List<Employee> emp, Integer bonus) {
        for (com.codegile.paula.week2.day2.problem1.problem2.model.Employee e : emp) {
            if (e instanceof Manager && getSex(e).equals("F")) {
                Manager m = (Manager) e;
                if (m.getDepositName().equals("IT")) {
                    e.setSalary(e.getSalary() + bonus);
                }
            }
        }
        return emp;
    }

    public void printDirectorOverThirty(List<Employee> employees) {
        for (Employee e : employees) {
            if (e instanceof Director && getAge(e) > 30) {
                Director d = (Director) e;
                System.out.println(d.getId() + " " + d.getName() + " " +
                        d.getCNP() + " " + d.getSalary() + " " + d.getBudget());
            }
        }
    }
}
