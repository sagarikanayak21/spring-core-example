package com.sn.dao;

// Dummy/Mock implementation for AccountDAOI

public class AccountsDAO implements AccountsDAOI {
    public void setBalance(int accNo, double bal) {
        System.out.println("Balace updated amount " + bal + " for account number " + accNo);
        // In real time we have to connect with DB for updation
    }
    public double getBalance(int accNo) {
         // In real time we have to connect with DB to get bal against the accNo
         System.out.println("In getBalance for account number " + accNo);
         return 100000;
    }
}