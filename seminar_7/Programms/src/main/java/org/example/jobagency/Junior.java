package org.example.jobagency;

import java.util.Random;

public class Junior implements Observer{
    String name;
    int salary;

    public Junior(String name) {
        this.name = name;
        salary = 0;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if(new Random().nextBoolean() ){
            System.out.println("I need a work!");
        } else {
            System.out.println("okay(");
        }
    }
}
