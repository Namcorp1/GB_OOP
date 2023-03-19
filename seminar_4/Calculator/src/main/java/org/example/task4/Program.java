package org.example.task4;

import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            employeeArrayList.add(new Employee("FIO - " + i, new Random().nextDouble(),"Python"));
        }
        LRUCache<Employee> lruCache = new LRUCache<>(3);
        for (Employee i: employeeArrayList) {
            System.out.println(i);
            lruCache.addElement(i);
        }
        for (Employee i: lruCache.getAllElement()) {
            System.out.println(i);
        }
        lruCache.addElement(new Employee("MNA",34000.0,"senior"));
        for (Employee i: lruCache.getAllElement()) {
            System.out.println(i);
        }
        System.out.println(lruCache.getElement(1));
    }
}
