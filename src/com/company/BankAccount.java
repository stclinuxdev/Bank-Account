package com.company;

public class BankAccount {
    private String customerName;
    private String number;
    private double balance;
    private String customerEmail;
    private String customerPhoneNumber;


    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit amount: $" + depositAmount + ". New balance: $" + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (withdrawalAmount > this.balance) {
            System.out.println("Only " + balance + " is available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal amount: $" + withdrawalAmount + ". New balance: $" + this.balance);
        }
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }
}
