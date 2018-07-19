package com.codegile.paula.week3.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        HashMap<String, Double> map = new HashMap<>();
        // Put elements to the map
        map.put("Zara", new Double(3434.34));
        map.put("Mahnaz", new Double(123.22));
        map.put("Ayan", new Double(1378.00));
        map.put("Daisy", new Double(99.22));
        map.put("Qadir", new Double(-19.08));
        List<Double> list = new ArrayList<>();
        list.add((double) 88);
        list.add((double) -12);
        list.add(-19.2);
        list.add((double) 198);
        //service.hashMapToArrayList(map);
        //service.arrayListToHashSet(list);
        //service.arrayListToSortedSet(list);
        //service.iteratorNumberOneArrayList(list);
//        service.iteratorNumberTwoArrayList(list);
        //service.iteratorNumberThreeArrayList(list);
        //service.iteratorNumberFourArrayList(list);
        //service.iteratorNumberFiveArrayList(list);
        //service.iteratorNumberOneHashMap(map);
        //service.iteratorNumberTwoHashMap(map);
        service.iteratorNumberThreeHashMap(map);
    }
}
