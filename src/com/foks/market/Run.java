package com.foks.market;

public class Run {

    public static void main(String[] args) throws MoneyShortageException{
        Customer.firstAddCustomers();
        Product.firstAddProducts();
        Menu.displayCustomers();
        Menu.displayProducts();
        Menu.buyGoods();
        System.out.println(CustomersProducts.purchasedGoods);
        Menu.buyGoods();
        System.out.println(CustomersProducts.purchasedGoods);
        Menu.getItemsByIdUsers();
        Menu.getUsersByIdItems();
    }
}
