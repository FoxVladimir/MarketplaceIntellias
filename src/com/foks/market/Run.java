package com.foks.market;

public class Run {

    public static void main(String[] args) throws MoneyShortageException{

        //ініціація покупців та товарів
        Customer.firstAddCustomers();
        Product.firstAddProducts();

        //вивід інфо про покупців та товар
        Menu.displayCustomers();
        Menu.displayProducts();

        //купуємо товар, ввід id купця та товару через консоль
        Menu.buyGoods();
        System.out.println(CustomersProducts.purchasedGoods);
        Menu.buyGoods();
        System.out.println(CustomersProducts.purchasedGoods);

        //інфо по покупкам та власникам за вводом id
        Menu.getItemsByIdUsers();
        Menu.getUsersByIdItems();
    }
}
