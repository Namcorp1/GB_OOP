package org.example;

import org.example.model.Calculator;
import org.example.model.Logger;
import org.example.view.View;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Presenter p = new Presenter(new Calculator(),new View(),new Logger());
        p.buttonClick();
    }
}