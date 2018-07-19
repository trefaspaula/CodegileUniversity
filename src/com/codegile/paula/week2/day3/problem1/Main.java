package com.codegile.paula.week2.day3.problem1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        List<Client> clientList = bank.readFromFile("clients.txt");
        //bank.printData(clientList);
        List<Account> accounts = clientList.get(0).getAccounts();
        bank.printAccounts(accounts);
        System.out.println("------------");
        for (Account acc : accounts) {
            if (acc instanceof FixedDayAccount) {
                FixedDayAccount account = (FixedDayAccount) acc;
//                try {
//                    account.addDeposit((double) 100);
//                } catch (InvalidDate e) {
//
//                }
                try {
                    account.extractMoney((double) 3100);

                } catch (InvalidSold e) {

                } catch (InvalidInterest e) {

                }
            }
        }
        bank.printAccounts(accounts);

    }
}
