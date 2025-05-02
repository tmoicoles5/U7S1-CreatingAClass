package com.codedifferently.labs.partA.ex01;

import partA.ex01.CheckingAccount;

public class CheckingAccountTest {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setName(" ...");
        checkingAccount.deposit(5000000000000L);
        checkingAccount.getBalance();
    }
}
