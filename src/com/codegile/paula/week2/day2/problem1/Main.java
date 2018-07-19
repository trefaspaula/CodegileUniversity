package com.codegile.paula.week2.day2.problem1;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Institution inst = Institution.getInstance();
        List<Employee> emp = inst.readEmployeeFromFile("employee.txt");
        List<Bonus> bonuses = inst.readBonusFromFile("bonus.txt");
        //inst.printEmployee(emp);
        //inst.printBonus(bonuses);
        Map<Employee, List<Bonus>> setBonuses = inst.setBonuses(bonuses);
        Map.Entry<Employee, List<Bonus>> maxBonuses = inst.maxBonus(setBonuses);
        inst.printMaxBonus(maxBonuses);
        //System.out.print(maxBonus.getFullName());
        Map<Integer, List<Bonus>> map = inst.report(bonuses, 2018);
        //System.out.print(inst.getMonthFromDate(bonuses.get(1)));
        //inst.printReport(map);

    }
}
