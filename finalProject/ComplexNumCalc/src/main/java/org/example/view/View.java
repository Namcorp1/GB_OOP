package org.example.view;

import org.example.num.ComplexNumber;

import java.util.Objects;
import java.util.Scanner;

public class View implements IView {

    Scanner in = new Scanner(System.in);

    @Override
    public void welcome() {
        System.out.println("Калькулятор комплексных чисел 1.0");
        System.out.println("Формат записи комплексного числа: a + b * j,");
        System.out.println("где a и b - вещественные числа, которые вам необходимо ввести.");
        System.out.println("Успешных расчётов!");
    }

    @Override
    public ComplexNumber getComplexNumber(String title) {
        System.out.printf("Введите вещественную часть %s числа (a): ", title);
        double a = in.nextDouble();
        System.out.printf("Введите мнимую часть %s числа (b): ", title);
        double b = in.nextDouble();
        return new ComplexNumber(a, b);
    }

    @Override
    public String inputOperations() {
        System.out.println("Введите команду (+, -, *, /) : ");
        return in.next();
    }

    @Override
    public void printResult(ComplexNumber res) {
        System.out.println("Результат: " + res.toString());
    }

    @Override
    public String nameLogFile() {
        String name = "log.txt";
        System.out.println("Перед началом работы желаете изменить имя файла логирования, по умолчанию 'log.txt' (Y/N)?");
        if (Objects.equals(in.next(), "Y")) {
            System.out.println("Введите новое имя файла логирования: ");
            name = in.next() + ".txt";
        }
        return name;
    }
    public boolean repeat() {
        System.out.println("Желаете продолжить (Y/N)?");
        if (Objects.equals(in.next(), "Y")) {
            return true;
        } else {
            return false;
        }
    }
}
