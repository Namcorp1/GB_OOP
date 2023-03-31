package org.example.view;

import org.example.num.ComplexNumber;

public interface IView {
    public void welcome();
    public ComplexNumber getComplexNumber(String title);
    public String inputOperations();
    public void printResult(ComplexNumber res);

    public String nameLogFile();
}
