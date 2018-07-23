package com.codegile.paula.week4.day1.problem2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService s = Executors.newFixedThreadPool(3);
        List<Car> listOfCars = new ArrayList<>();
        for (int i = 0; i < 9; i++)
            listOfCars.add(new Car("t" + i));
        for (int i = 0; i < listOfCars.size(); i++)
            s.submit(listOfCars.get(i));
        s.shutdown();


    }
}
