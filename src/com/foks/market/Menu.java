package com.foks.market;

class Menu {

    public static void displayCustomers(){
        for(Customer customer : Customer.customers){
            System.out.println(customer.toString());
        }
    }

    public static void displayProducts(){
        for(Product product : Product.products){
            System.out.println(product.toString());
        }
    }
}
