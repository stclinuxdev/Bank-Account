package com.company;

public class Main {

    public static void main(String[] args) {

        // Testing our BankAccount class
        BankAccount myAccount = new BankAccount();
        myAccount.setCustomerName("Sergei Topal");
        myAccount.setCustomerEmail("sergei@example.com");
        myAccount.setCustomerPhoneNumber("0-945-783-4");
        myAccount.setBalance(90.5);
        myAccount.setNumber("00293 56738 48582 90");

        // Executing deposit and withdrawal methods
        myAccount.deposit(100.0);
        myAccount.withdrawal(76.4);
    }
}
