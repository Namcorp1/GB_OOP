package org.example;

public class Main {
    public static void main(String[] args) {

        Fruit fruit = Fruit.APPLE;

        switch (fruit){
            case PEAR -> {
                System.out.println("Это груша!");
            }
            case APPLE -> {
                System.out.println("Это яблоко!");
            }
            case ORANGE -> {
                System.out.println("Это апельсин!");
            }
            case PINEAPPLE -> {
                System.out.println("Это ананас!");
            }
            case BANANA -> {
                System.out.println("Это банан!");
            }
        }
    }
}