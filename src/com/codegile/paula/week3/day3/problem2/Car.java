package com.codegile.paula.week3.day3.problem2;

import java.util.Calendar;
import java.util.Random;

import static com.codegile.paula.week3.day3.problem2.Main.MAX_CARS;

public class Car extends Thread {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(10000));
            System.out.printf("The car %s is waiting\n", name);
            System.out.println("Parking spaces free " + Main.parking.availablePermits());

            Main.parking.acquire();
            Integer startSeconds = Calendar.getInstance().get(Calendar.SECOND);
            Integer startMinute = Calendar.getInstance().get(Calendar.MINUTE);
            System.out.printf("The car %s is inside\n", name);
            Integer nr = new Random().nextInt(10000);
            Thread.sleep(nr);
            System.out.println("Parking spaces free " + Main.parking.availablePermits());

            System.out.printf("Current number of spaces parking %d\n", MAX_CARS - (Main.parking.availablePermits()));
            Main.parking.release();

            Integer stopSeconds = Calendar.getInstance().get(Calendar.SECOND);
            Integer stopMinute = Calendar.getInstance().get(Calendar.MINUTE);

            System.out.printf("Waited time of %s\n ", name + " " + (stopMinute - startMinute) * 60 + (stopSeconds - startSeconds));
            System.out.println("Number of cars who are waiting " + Main.parking.getQueueLength());
            System.out.printf("The car %s is out\n", name);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
