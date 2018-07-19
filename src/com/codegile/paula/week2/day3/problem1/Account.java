package com.codegile.paula.week2.day3.problem1;

public abstract class Account {
    private double existingMoney;
    private String creationDate;

    public abstract void addDeposit(Double value) throws InvalidDate;

    public abstract void extractMoney(Double value) throws InvalidInterest, InvalidSold;

    public double getExistingMoney() {
        return existingMoney;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setExistingMoney(double existingMoney) {
        this.existingMoney = existingMoney;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

}
