package com.foks.market;

import java.util.Scanner;

class Menu {

    static int idUser;
    static int idProduct;

    //показ листа покупців
    public static void displayCustomers(){
        for(Customer customer : Customer.customers){
            System.out.println(customer.toString());
        }
    }

    //показ листа товарів
    public static void displayProducts(){
        for(Product product : Product.products){
            System.out.println(product.toString());
        }
    }

    //запит ID покупця для проведення покупки
    public static void idCustomer(){
        boolean correctId = false;
        Scanner scanner = new Scanner(System.in);
        while (!correctId){
            System.out.println("Please, enter ID of customer");
            int id = scanner.nextInt();
            for(Customer customer : Customer.customers){
                if(id == customer.getId()){
                    System.out.println("Ok");
                    idUser = id;
                    correctId = true;
                    break;
                }
            }
            if(correctId == false){
                System.out.println("You entered wrong ID");
            }
        }
    }

    //запит ID товару для проведення покупки
    public static void idProduct(){
        boolean correctId = false;
        Scanner scanner = new Scanner(System.in);
        while (!correctId){
            System.out.println("Please, enter ID of product");
            int id = scanner.nextInt();
            for(Product product : Product.products){
                if(id == product.getId()){
                    System.out.println("Ok");
                    idProduct = id;
                    correctId = true;
                    break;
                }
            }
            if(correctId == false){
                System.out.println("You entered wrong ID");
            }
        }
    }

    //перевірка на достатність грошей
    //якщо грошей достатньо - відбувається покупка, запис даних в лист покупця та лист товару
    public static void enoughMoney() throws MoneyShortageException {
        Customer buyingCastomer = null;
        Product buyingProduct = null;
        int money = 0;
        int price = 0;

        for (Customer customer : Customer.customers){
            if (idUser == customer.getId()){
                money = customer.getMoney();
                buyingCastomer = customer;
            }
        }

        for (Product product : Product.products){
            if (idProduct == product.getId()){
                price = product.getPrice();
                buyingProduct = product;
            }
        }

        if (money < price){
            throw new MoneyShortageException("The buyer does not have enough money");
        } else {
            System.out.println("Successful purchase!");
            System.out.println(buyingCastomer.getFirstName() + " " + buyingCastomer.getLastName() + " bought " + buyingProduct.getName()+ ".");
            System.out.println("Congratulations!");
            buyingCastomer.setMoney(money-price);
            for (int i = 0; i < Customer.customers.size(); i++){
                if (buyingCastomer.getId() == Customer.customers.get(i).getId()){
                    Customer.customers.get(i).setMoney(money-price);
                    Customer.addProducts(buyingCastomer.getId(), buyingProduct);
                    Product.addCustomers(buyingProduct.getId(), buyingCastomer);
                }
            }
            CustomersProducts.purchasedGoods.put(buyingCastomer, buyingProduct);

        }
    }

    //ініціалізація перевірок ID та покупка
    public static void buyGoods() throws MoneyShortageException {
        idCustomer();
        idProduct();
        enoughMoney();
    }

    //знаходимо покупки товарів по ID покупця
    static void getItemsByIdUsers(){
        boolean correctId = false;
        Scanner scanner = new Scanner(System.in);
        while (!correctId){
            System.out.println("Please, enter ID of Users to show items");
            int id = scanner.nextInt();
            if(id == 1){
                System.out.println(Customer.customer1List);
                correctId = true;
            } else if(id == 2){
                System.out.println(Customer.customer2List);
                correctId = true;
            } else if(id == 3){
                System.out.println(Customer.customer3List);
                correctId = true;
            } else{
                System.out.println("You entered wrong ID");
            }
        }
    }

    //знаходимо покупців по ID товару
    static void getUsersByIdItems(){
        boolean correctId = false;
        Scanner scanner = new Scanner(System.in);
        while (!correctId){
            System.out.println("Please, enter ID of product to show customers");
            int id = scanner.nextInt();
            if(id == 1){
                System.out.println(Product.product1List);
                correctId = true;
            } else if(id == 2){
                System.out.println(Product.product2List);
                correctId = true;
            } else if(id == 3){
                System.out.println(Product.product3List);
                correctId = true;
            } else{
                System.out.println("You entered wrong ID");
            }
        }
    }

}
