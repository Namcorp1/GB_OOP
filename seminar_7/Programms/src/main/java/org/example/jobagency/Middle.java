package org.example.jobagency;

public class Middle implements Observer{
    String name;
    int salary;

    public Middle(String name) {
        this.name = name;
        salary = 0;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if(this.salary < 20){
            System.out.println("Подходит!");
        } else{
            System.out.println("Не подходит!");
        }
    }
}
