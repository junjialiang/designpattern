package com.junjia.design.pattern.structural.bridge;

/**
 * Created by junjia
 */
public abstract class Bank {
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }
    abstract Account openAccount();

}
