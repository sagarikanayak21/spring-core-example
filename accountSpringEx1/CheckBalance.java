package com.sn.service;

import com.sn.dao.*;

// Dummy/Mock implementation

public class CheckBalance {
    private AccountsDAOI adao;
    public CheckBalance(AccountsDAOI adao) {
        this.adao= adao;
    }
    public boolean checkMinBal(int accNo, double withdrawAmount) {
        System.out.println("In withdraw account number " + accNo + " and withdrawAmount " + withdrawAmount);
        double availableBal = adao.getBalance(accNo);
       // Logic to check the minimum balance and available bal
        return withdrawAmount < 5000;
    }
}