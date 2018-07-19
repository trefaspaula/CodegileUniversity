package com.codegile.paula.week1.day1.problem4;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    public List<String> readAndWrite(String path) {
        File f = new File(path);

        List<String> content = new ArrayList<>();

        try {
            Scanner sc = new Scanner(f);
            PrintWriter writer = new PrintWriter("newfile.html");


            while (sc.hasNextLine()) {
                String var = sc.nextLine();
                if (var.contains("<span>")) {
                    var = var.replace("<span>", "<p>");
                }
                if (var.contains("</span>")) {
                    var = var.replace("</span>", "</p>");
                }
                writer.println(var);
            }
            writer.close();
        } catch (IOException ex) {

        }
        return content;
    }


}
