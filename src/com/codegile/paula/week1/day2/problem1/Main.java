package com.codegile.paula.week1.day2.problem1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        List<Employee> employs = new ArrayList<>();
        employs = employee.addEmploys(employs);
        //employee.print(employs);
        List<Employee> sortEmploys = new ArrayList<>();
        EmployeeService empServ = new EmployeeService();
//        sortEmploys=empServ.sortEmploys(employs);
//        employee.print(sortEmploys);
        Employee e = new Employee();
//        e=empServ.read();
//        empServ.create(e,employs);
//        employee.print(employs);
//         empServ.update(employs.get(employs.size()-1));
        empServ.delete(employs, employs.get(employs.size() - 1));
        employee.print(employs);


    }
}
