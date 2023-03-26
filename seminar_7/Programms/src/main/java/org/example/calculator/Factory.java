package org.example.calculator;

public class Factory implements ICalculableFactory{
   private Log log;
   private int primaryArg;
    @Override
    public Calculable create(int primaryArg) {
        //new LogCalculator().loggerOut("" + primaryArg);
        return new LogCalculator(primaryArg, new Log());
    }

}
