package org.example.calculator;

public class LogCalculator implements Calculable {

    private int primaryArg;
    private Log log;

    public LogCalculator(int primaryArg,Log log) {
        this.log = log;
        this.primaryArg = primaryArg;
        log.loggerOut("" + primaryArg);
    }

    @Override
    public Calculable sum(int arg) {
        primaryArg += arg;
        log.loggerOut("" + arg);
        return this;
    }

    @Override
    public Calculable multi(int arg) {
        log.loggerOut("" + arg);
        primaryArg *= arg;
        return this;
    }

    @Override
    public int getResult() {
        log.loggerOut("" + primaryArg);
        return primaryArg;
    }
}
