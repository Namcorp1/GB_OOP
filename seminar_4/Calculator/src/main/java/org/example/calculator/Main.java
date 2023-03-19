package org.example.calculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calc<Number> calc1 = new Calc<>();
        System.out.println(calc1.multiply(2.57,4));
        System.out.println(calc1.div(180,3.7));
        System.out.println(calc1.subtraction(180,3.6));
        System.out.println(calc1.bynaryTranslation(73));
        System.out.println(calc1.bynaryTranslation(73.0));
    }
}