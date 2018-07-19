package com.codegile.paula.week2.day3.problem1;

public class CurrentAccount extends Account {
    private final double extractedMoney = 1100;

    public double getExtractedMoney() {
        return extractedMoney;
    }

    @Override
    public void addDeposit(Double value) throws InvalidDate {
        this.setExistingMoney(this.getExistingMoney() + value);
    }

    @Override
    public void extractMoney(Double value) throws InvalidInterest, InvalidSold {
        if (value > this.getExistingMoney() - extractedMoney)
            throw new InvalidSold("Sold insuficient");
        else {
            this.setExistingMoney(this.getExistingMoney() - value);
        }
    }
}
