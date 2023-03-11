package org.example;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Category milk_products = new Category("Молочные продукты", new Product[]{new Product("молоко", 63, 4.6)
                , new Product("кефир", 68, 4.1), new Product("йогурт", 79, 4.7)
                , new Product("сливки", 89, 4.4), new Product("ряженка", 65, 4.5)});
        Category alcohol_products = new Category("Алкоголь", new Product[]{new Product("вино", 450, 4.3)
                , new Product("пиво", 73, 4.5), new Product("виски", 940, 4.4)});
        Category frozen_products = new Category("Алкоголь", new Product[]{new Product("пельмени", 270, 4.6)
                , new Product("вареники", 240, 3.9), new Product("овощная смесь", 180, 4.2)});
        User user1 = new User("Nikita", "qwerty1", new Basket(new Product[]{alcohol_products.products[0]
                , milk_products.products[1]}));
        User user2 = new User("Dasha", "wasd123", new Basket(new Product[]{milk_products.products[0]
                , milk_products.products[2]}));
        Category[] categories = new Category[]{milk_products, alcohol_products,frozen_products};
        Catalog catalog = new Catalog(categories);
        catalog.showProduct(categories);
        HashMap<Integer,Product> all = catalog.allProduct(categories);
        user1.basket.shopping(all);
    }
}