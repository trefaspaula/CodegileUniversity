package com.codegile.paula.week2.day3.problem1;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private Integer id;
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Client(Integer id, String name, List<Account> accounts) {
        this.id = id;
        this.name = name;
        this.accounts = accounts;
    }

    public Client() {

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
