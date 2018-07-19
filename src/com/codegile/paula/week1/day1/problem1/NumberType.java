package com.codegile.paula.week1.day1.problem1;

public class NumberType {
    private Integer odd;
    private Integer even;

    public NumberType() {
        odd = 0;
        even = 0;
    }

    public NumberType(Integer odd, Integer even) {
        odd = odd;
        even = even;
    }

    public void setOdd(Integer odd) {
        this.odd = odd;
    }

    public void setEven(Integer even) {
        this.even = even;
    }

    public Integer getOdd() {
        return odd;
    }

    public Integer getEven() {
        return even;
    }
}
