package com.foks.market;

public class MoneyShortageException extends Exception{

    //викидуємо виняток нехватки грошей
    public MoneyShortageException(String message){
        super(message);
    }
}
