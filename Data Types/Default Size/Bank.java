package com.defaultSize;

public class Bank {

    static String accountHolderName;
    static long accountNumber;
    static String accountType;
    static float accountBalance;
    static boolean isActive;

    public static void main(String[] args) {

        System.out.println("Bank Account Information");
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("Account Active Status: " + isActive);
    }
}