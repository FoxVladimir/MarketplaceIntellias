package com.foks.market;

import java.util.ArrayList;
import java.util.List;

class Product {

    private int id;
    private String name;
    private long price;
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

    public Product(int id, String name, long price) {
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

    public static void firstAddProducts(){
        Product product1 = new Product(1, "TV", 1000L);
        Product product2 = new Product(2, "laptop", 2000L);
        Product product3 = new Product(3, "Phone", 2500L);
        products.add(product1);
        products.add(product2);
        products.add(product3;
    }
}
