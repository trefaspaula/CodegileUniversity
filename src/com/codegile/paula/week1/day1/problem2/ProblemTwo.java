package com.codegile.paula.week1.day1.problem2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProblemTwo {

    public static List<Name> read(String nameFile) {
        File f = new File(nameFile);
        List<Name> allNames = new ArrayList<>();

        try {
            Scanner sc = new Scanner(f);

            while (sc.hasNextLine()) {
                String name = sc.nextLine();
                String[] names = name.split(" ");
                if (names.length == 2) {
                    Name person = new Name();
                    person.setFirstName(names[0]);
                    person.setLastName(names[1]);
                    allNames.add(person);
                }
            }
        } catch (IOException ex) {

        }
        return allNames;
    }

    public static Integer test(List<Name> allNames) {
        Integer okNames = 0;
        Boolean okFirst = true;
        Boolean okLast = true;
        for (int i = 0; i < allNames.size(); i++) {
            if (allNames.get(i).getLastName().length() > 1 && allNames.get(i).getFirstName().length() > 1) {
                if (!Character.isUpperCase((allNames.get(i).getFirstName().charAt(0)))) {
                    okFirst = false;

                }
                if (!Character.isUpperCase((allNames.get(i).getLastName().charAt(0)))) {
                    okLast = false;

                }
                if (okFirst == true) {
                    for (int j = 0; j < allNames.get(i).getFirstName().length(); j++) {
                        if (Character.isDigit((allNames.get(i).getFirstName().codePointAt(j)))) {
                            okFirst = false;
                        }
                        if (j != 0 && Character.isUpperCase((allNames.get(i).getFirstName().codePointAt(j)))) {
                            okFirst = false;
                        }
                    }
                }
                if (okLast == true) {
                    for (int j = 0; j < allNames.get(i).getLastName().length() - 1; j++) {
                        if (Character.isDigit((allNames.get(i).getLastName().codePointAt(j)))) {
                            okLast = false;
                        }
                        if (j != 0 && Character.isUpperCase((allNames.get(i).getLastName().codePointAt(j)))) {
                            okLast = false;
                        }
                    }
                }


                if (okFirst == true && okLast == true) {
                    okNames++;
                }
            }
            okFirst = true;
            okLast = true;

        }


        return okNames;
    }

    public static void print(ArrayList<Name> name) {
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i).getFirstName() + " " + name.get(i).getLastName());
        }
    }

    public static void main(String[] args) {
        List<Name> allName = read("nume.txt");
        Integer okNr = test(allName);
        System.out.print(okNr);


    }
}
