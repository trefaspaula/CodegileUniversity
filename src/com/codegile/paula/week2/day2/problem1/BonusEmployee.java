package com.codegile.paula.week2.day2.problem1;

public class BonusEmployee {
    private Employee employee;
    private Integer bonus;

    public BonusEmployee() {
        bonus = 0;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Integer getBonus() {
        return bonus;
    }
}
