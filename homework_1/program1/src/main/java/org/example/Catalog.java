package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Catalog {
    public Category[] categories;

    public Catalog(){};
    public Catalog(Category[] categories){
        this.categories = categories;
    }

    public void showProduct(Category[] categories) {
        System.out.println("Список всех продуктов:");
        for (int i = 0; i < categories.length; i++) {
            for (int j = 0; j < categories[i].products.length; j++) {
                System.out.println((i * 3 + j + 1)+ ". " + categories[i].products[j].name + "("
                        + categories[i].products[j].price + "руб. / " + categories[i].products[j].rating + " оч.)");
            }
        }
    }

    public HashMap<Integer,Product> allProduct(Category[] categories){
        HashMap<Integer,Product> allProducts = new HashMap<>();
        for (int i = 0; i < categories.length; i++) {
            for (int j = 0; j < categories[i].products.length; j++) {
                allProducts.put(i * 3 + j + 1,categories[i].products[j]);
            }
        }
        return allProducts;
    }
}
