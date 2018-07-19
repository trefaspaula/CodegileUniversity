package com.codegile.paula.week2.day3.problem1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private final String CLIENT = "CLIENT";
    private static Bank ourInstance = new Bank();

    public static Bank getInstance() {
        return ourInstance;
    }

    Bank() {
    }

    public List<Client> readFromFile(String fileName) {
        List<Client> clients = new ArrayList<>();
        List<Account> accounts = new ArrayList<>();
        File f = new File(fileName);
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String type = sc.nextLine();
                if (type.equals(CLIENT)) {
                    Client client = new Client();
                    String s = sc.nextLine();
                    String[] split = s.split(" ");
                    client.setId(Integer.parseInt(split[0]));
                    client.setName(split[1]);
                    accounts = new ArrayList<>();
                    client.setAccounts(accounts);
                    clients.add(client);
                } else {
                    switch (AccountType.valueOf(type)) {
                        case FIXEDDAYACCOUNT:
                            FixedDayAccount account = new FixedDayAccount();
                            String sp = sc.nextLine();
                            String[] spl = sp.split(" ");
                            account.setExistingMoney((Double.parseDouble(spl[0])));
                            account.setCreationDate(spl[1]);
                            account.setInterest(Double.parseDouble(spl[2].substring(0, 1)));
                            setClientAccount(account, clients);
                            break;
                        case CURRENTACCOUNT:
                            CurrentAccount account1 = new CurrentAccount();
                            String s1 = sc.nextLine();
                            String[] strings = s1.split(" ");
                            account1.setExistingMoney(Double.parseDouble(strings[0]));
                            account1.setCreationDate(strings[1]);
                            setClientAccount(account1, clients);
                    }
                }
            }

        } catch (IOException ex) {

        }
        return clients;
    }

    private List<Client> setClientAccount(Account account, List<Client> clients) {
        List<Account> currentAccount = clients.get(clients.size() - 1).getAccounts();
        currentAccount.add(account);
        clients.get(clients.size() - 1).setAccounts(currentAccount);
        return clients;
    }

    public void printData(List<Client> clients) {
        for (Client c : clients) {
            System.out.println(c.getId() + " " + c.getName() + " ");
            for (Account a : c.getAccounts()) {
                if (a instanceof FixedDayAccount) {
                    FixedDayAccount f = (FixedDayAccount) a;
                    System.out.println("Accounts FixedDayAccount---->" + f.getExistingMoney() + " " + f.getCreationDate() +
                            " " + f.getInterest() + " " + f.getDueDate());
                } else {
                    if (a instanceof CurrentAccount) {
                        CurrentAccount currentAccount = (CurrentAccount) a;
                        System.out.println("Account CurrentAccount--->" + currentAccount.getExistingMoney() + " " +
                                currentAccount.getCreationDate() + " " + currentAccount.getExtractedMoney());
                    }
                }
            }
        }
    }

    public void printAccounts(List<Account> accounts) {
        for (Account account : accounts) {
            if (account instanceof FixedDayAccount) {
                FixedDayAccount f = (FixedDayAccount) account;
                System.out.println("Accounts FixedDayAccount---->" + f.getExistingMoney() + " " + f.getCreationDate() +
                        " " + f.getInterest() + " " + f.getDueDate());
            } else {
                if (account instanceof CurrentAccount) {
                    CurrentAccount currentAccount = (CurrentAccount) account;
                    System.out.println("Account CurrentAccount--->" + currentAccount.getExistingMoney() + " " +
                            currentAccount.getCreationDate() + " " + currentAccount.getExtractedMoney());
                }
            }
        }

    }
}
