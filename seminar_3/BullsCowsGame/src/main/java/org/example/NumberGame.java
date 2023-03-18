package org.example;

import java.util.ArrayList;
import java.util.List;

public class NumberGame extends AbstractClass{

    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            charList.add(String.valueOf(i));
        }
        return charList;
    }
}
