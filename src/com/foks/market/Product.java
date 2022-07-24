package com.foks.market;

import java.util.ArrayList;
import java.util.List;

class Product {

    private int id;
    private String name;
    private int price;
    static List<Product> products = new ArrayList<>();

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    long getPrice() {
        return price;
    }

    Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    static void firstAddProducts(){
        Product product1 = new Product(1, "Phone", 1000);
        Product product2 = new Product(2, "TV", 2000);
        Product product3 = new Product(3, "Laptop", 2500);
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }
}
