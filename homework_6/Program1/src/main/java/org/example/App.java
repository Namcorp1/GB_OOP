package org.example;

import org.example.model.Model;
import org.example.view.View;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Controller controller = new Controller(new View(),new Model());
        controller.ButtonClick();
    }
}