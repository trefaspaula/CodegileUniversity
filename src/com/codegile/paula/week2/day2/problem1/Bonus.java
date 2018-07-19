package com.codegile.paula.week2.day2.problem1;

public class Bonus {
    private Integer pieces;
    private String description;
    private String date;
    private Employee owner;


    public void setPieces(Integer pieces) {
        this.pieces = pieces;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setOwner(Employee owner) {
        this.owner = owner;
    }

    public Integer getPieces() {
        return pieces;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public Employee getOwner() {
        return owner;
    }
}
