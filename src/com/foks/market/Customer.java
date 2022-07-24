package com.foks.market;

import java.util.ArrayList;
import java.util.List;

class Customer {

    public static List<Product> customer1List = new ArrayList<>();
    public static List<Product> customer2List = new ArrayList<>();
    public static List<Product> customer3List = new ArrayList<>();

    private int id;
    private String firstName;
    private String lastName;
    private int money;
    static List <Customer> customers = new ArrayList<>();

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    Customer(int id, String firstName, String lastName, int money) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", money=" + money +
                '}';
    }

    static void firstAddCustomers(){
        Customer customer1 = new Customer(1,"Tor", "Surikatovich", 4000);
        Customer customer2 = new Customer(2,"Borys", "Jonsonyuk", 5000);
        Customer customer3 = new Customer(3,"Alex", "Arestovych", 20000);
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
    }

    static void addProducts(int id, Product product){
        switch (id){
            case 1:
                customer1List.add(product);
                break;
            case 2:
                customer2List.add(product);
                break;
            case 3:
                customer3List.add(product);
                break;
        }
    }
}
