package com.codegile.paula.week2.day3.problem1;

import java.util.Calendar;

public class FixedDayAccount extends Account {
    private final String dueDate = "01.08.2020";
    private double interest;

    public String getDueDate() {
        return dueDate;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Override
    public void addDeposit(Double value) throws InvalidDate {
        if (Calendar.getInstance().get(Calendar.YEAR) < (Integer.parseInt(dueDate.substring(6, 10)))) {
            this.setExistingMoney(this.getExistingMoney() + value);
        } else
            throw new InvalidDate("Contul a ajuns la data scadenta");
    }

    @Override
    public void extractMoney(Double value) throws InvalidInterest, InvalidSold {
        if (this.getInterest() == 0) {
            throw new InvalidInterest("Dobanda este setata la valorea 0");
        }
        if (this.getExistingMoney() < value) {
            throw new InvalidSold("Soldul dumneavoastra este insuficient");
        } else
            this.setExistingMoney(this.getExistingMoney() - value);
    }
}
