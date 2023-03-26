package org.example.calculator;

public class Log implements Logger{

    String message;
    public Log() {
    }

    public Log(String message) {
        this.message = message;
    }

    @Override
    public void loggerOut(String message) {
        System.out.println("log: " + message);
    }
}
