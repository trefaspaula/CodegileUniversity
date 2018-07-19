package com.codegile.paula.week3.day1;

import java.util.*;

public class ServiceImpl implements Service {
    @Override
    public void hashMapToArrayList(HashMap<String, Double> map) {
        List<Double> a = new ArrayList<>(map.values());
        for (Double i : a)
            System.out.print(i + " ");

    }

    @Override
    public void arrayListToHashSet(List<Double> list) {
        HashSet<Double> hashSet = new HashSet<>(list);
        for (double temp : hashSet) {
            System.out.print(temp + " ");
        }

    }

    @Override
    public void arrayListToSortedSet(List<Double> list) {
        SortedSet<Double> sortedSet = new TreeSet<>(list);
        for (double temp : sortedSet) {
            System.out.print(temp + " ");
        }

    }

    @Override
    public void iteratorNumberOneArrayList(List<Double> array) {
        for (Double a : array) {
            System.out.print(a + " ");
        }

    }

    @Override
    public void iteratorNumberTwoArrayList(List<Double> array) {
        int i = 0;
        while (i < array.size()) {
            System.out.print(array.get(i) + " ");
            i++;
        }

    }

    @Override
    public void iteratorNumberThreeArrayList(List<Double> array) {
        array.forEach(aDouble -> {
            System.out.print(aDouble + " ");
        });
    }

    @Override
    public void iteratorNumberFourArrayList(List<Double> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }

    @Override
    public void iteratorNumberFiveArrayList(List<Double> array) {
        Iterator<Double> iterator = array.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    @Override
    public void iteratorNumberOneHashMap(HashMap<String, Double> map) {
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println("key: " + entry.getKey() + " " + "value: " + entry.getValue());
        }
    }

    @Override
    public void iteratorNumberTwoHashMap(HashMap<String, Double> map) {
        Iterator it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Double> newEntry = (Map.Entry<String, Double>) it.next();
            System.out.println("key: " + newEntry.getKey() + " " + "value: " + newEntry.getValue());
        }
    }

    @Override
    public void iteratorNumberThreeHashMap(HashMap<String, Double> map) {
        map.forEach((key, value) -> System.out.println(key + "=" + value));
    }
}
