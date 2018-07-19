package com.codegile.paula.week2.day2.problem1;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Institution {
    private static Institution ourInstance = new Institution();

    public static Institution getInstance() {
        return ourInstance;
    }

    private Institution() {
    }

    public List<Employee> readEmployeeFromFile(String nameFile) {
        List<Employee> emp = new ArrayList<>();
        File f = new File(nameFile);
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String type = sc.nextLine();
                switch (EmployeeType.valueOf(type)) {
                    case MANAGER:
                        Manager manager = new Manager();
                        manager.setFullName(sc.nextLine());
                        emp.add(manager);
                        break;
                    case SECRETARY:
                        Secretary secretary = new Secretary();
                        secretary.setFullName(sc.nextLine());
                        emp.add(secretary);
                        break;
                    case CEO:
                        CEO ceo = new CEO();
                        ceo.setFullName(sc.nextLine());
                        emp.add(ceo);
                }
            }

        } catch (IOException ex) {

        }
        return emp;
    }

    public List<Bonus> readBonusFromFile(String nameFile) {
        List<Bonus> bonuses = new ArrayList<>();
        File f = new File(nameFile);
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String type = sc.nextLine();
                switch (BonusType.valueOf(type)) {
                    case MONEY:
                        Money bon = new Money();
                        String bonus = sc.nextLine();
                        String[] split = bonus.split(" ");
                        bon.setPieces(Integer.parseInt(split[0]));
                        bon.setDescription(split[1]);
                        bon.setDate(split[2]);
                        Employee emp = new Employee();
                        emp.setFullName(split[3]);
                        bon.setOwner(emp);
                        bonuses.add(bon);

                        break;
                    case FREEDAYS:
                        FreeDays freeDays = new FreeDays();
                        String bonu = sc.nextLine();
                        String[] spli = bonu.split(" ");
                        freeDays.setPieces(Integer.parseInt(spli[0]));
                        freeDays.setDescription(spli[1]);
                        freeDays.setDate(spli[2]);
                        Employee employee = new Employee();
                        employee.setFullName(spli[3]);
                        freeDays.setOwner(employee);
                        bonuses.add(freeDays);
                        break;
                    case BEAUTYPRODUCTS:
                        BeautyProducts beautyProducts = new BeautyProducts();
                        String s = sc.nextLine();
                        String[] split1 = s.split(" ");
                        beautyProducts.setPieces(Integer.parseInt(split1[0]));
                        beautyProducts.setDescription(split1[1]);
                        beautyProducts.setDate(split1[2]);
                        Employee employee1 = new Employee();
                        employee1.setFullName(split1[3]);
                        beautyProducts.setOwner(employee1);
                        bonuses.add(beautyProducts);
                }
            }

        } catch (IOException ex) {

        }
        return bonuses;
    }

    public void printEmployee(List<Employee> emp) {
        for (Employee e : emp) {
            System.out.println(e.getFullName() + " ");
        }
    }

    public void printBonus(List<Bonus> bon) {
        for (Bonus b : bon) {
            System.out.println(b.getPieces() + " " + b.getDescription() + " " + b.getDate() + " " + b.getOwner().getFullName());
        }
    }

    public List<BonusEmployee> setBonusEmployee(List<Bonus> bonuses) {
        List<BonusEmployee> bonusEmployees = new ArrayList<>();
        boolean contains = false;
        int j;
        for (int i = 0; i < bonuses.size(); i++) {
            for (j = 0; j < bonusEmployees.size(); j++) {
                if (bonuses.get(i).getOwner() == bonusEmployees.get(j).getEmployee()) {
                    bonusEmployees.get(j).setBonus(bonusEmployees.get(j).getBonus() + 1);
                    contains = true;

                }
            }
            if (contains == false) {
                BonusEmployee bonusEmployee = new BonusEmployee();
                bonusEmployee.setEmployee(bonuses.get(i).getOwner());
                bonusEmployees.add(bonusEmployee);
                j = 0;
            }
        }
        return bonusEmployees;
    }

    public Map<Employee, List<Bonus>> setBonuses(List<Bonus> bonuses) {
        Map<Employee, List<Bonus>> map = new HashMap<>();
        boolean contains = false;
        for (Bonus b : bonuses) {
            List<Bonus> bonusList = map.get(b.getOwner());
            if (bonusList != null) {
                bonusList.add(b);
            } else {
                bonusList = new ArrayList<>();
                bonusList.add(b);
            }
            map.put(b.getOwner(), bonusList);

        }
        return map;
    }

    public Map.Entry<Employee, List<Bonus>> maxBonus(Map<Employee, List<Bonus>> m) {
        Iterator it = m.entrySet().iterator();
        Map.Entry<Employee, List<Bonus>> entry = ((Map.Entry<Employee, List<Bonus>>) it.next());
        while (it.hasNext()) {
            Map.Entry<Employee, List<Bonus>> newEntry = (Map.Entry<Employee, List<Bonus>>) it.next();
            if (newEntry.getValue().size() > entry.getValue().size()) {
                entry = newEntry;
            }
        }
        return entry;
    }

    public void printMaxBonus(Map.Entry<Employee, List<Bonus>> m) {
        System.out.println(m.getKey().getFullName());
        for (int i = 0; i < m.getValue().size(); i++) {
            System.out.print("---->" + m.getValue().get(i).getDate() + " " + m.getValue().get(i).getDescription());
        }
    }

    public Integer getYearFromDate(Bonus bonus) {
        return Integer.parseInt(bonus.getDate().substring(6, 10));
    }

    public Integer getMonthFromDate(Bonus bonus) {
        String month = (bonus.getDate().substring(3, 5));
        if (month.substring(0, 1).equals("0"))
            return Integer.parseInt(month.substring(1, 2));
        else
            return Integer.parseInt(month);

    }

    public Map<Integer, List<Bonus>> report(List<Bonus> bonuses, Integer year) {
        Map<Integer, List<Bonus>> map = new HashMap<>();

        for (int i = 1; i <= 12; i++) {
            List<Bonus> bonuses1 = new ArrayList<>();
            for (Bonus b : bonuses) {
                if (getYearFromDate(b).equals(year) && getMonthFromDate(b).equals(i)) {
                    bonuses1.add(b);
                }
            }
            map.put(i, bonuses1);

        }
        return map;
    }

    public void printReport(Map<Integer, List<Bonus>> map) {
        for (Map.Entry<Integer, List<Bonus>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-----------");
            List<Bonus> b = entry.getValue();
            for (int i = 0; i < b.size(); i++) {
                System.out.println(b.get(i).getDate() + " " + b.get(i).getDescription() + " ");
            }
        }
    }

}
