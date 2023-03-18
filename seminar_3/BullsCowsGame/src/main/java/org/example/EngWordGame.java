package org.example;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EngWordGame extends AbstractClass{

    @Override
    List<String> generateCharList() throws IOException {
        List<String> charList = new ArrayList<>();
        Scanner scanner = new Scanner(Paths.get("src/main/java/org/example/eng.txt"), "UTF-8");
        int i = 0;
        while (scanner.hasNextLine()) {
            charList.add(scanner.nextLine());
        }
        return charList;
    }

}
