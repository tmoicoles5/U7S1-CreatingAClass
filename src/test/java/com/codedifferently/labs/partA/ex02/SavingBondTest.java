package com.codedifferently.labs.partA.ex02;

import partA.ex02.SavingBond;

public class SavingBondTest {
    public static void main(String[] args) {
        SavingBond savingBond = new SavingBond();
        savingBond.investment = 1000;
        savingBond.interestRate = 2;
        double rate1 =savingBond.Buy(10);
        savingBond.displaySavingsBond();
        System.out.println("Returned Rate Tier: " + rate1);
        System.out.println("Expected: 0.5\n");



        SavingBond bond2 = new SavingBond();
        bond2.investment = 1500;
        bond2.interestRate = 3;
        double rate2 = bond2.Buy(24);
        bond2.displaySavingsBond();
        System.out.println("Returned Rate Tier: " + rate2);
        System.out.println("Expected: 1.5\n");



        SavingBond bond3 = new SavingBond();
        bond3.investment = 2000;
        bond3.interestRate = 1;
        double rate3 = bond3.Buy(48);
        bond3.displaySavingsBond();
        System.out.println("Returned Rate Tier: " + rate3);
        System.out.println("Expected: 2.5\n");

    }
}
