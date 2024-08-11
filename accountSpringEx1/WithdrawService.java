package com.sn.service;
import com.sn.dao.*;
// Dummy/Mock implementation

public class WithdrawService {
    private AccountsDAOI adao;
    private CheckBalance cb;
    public WithdrawService(AccountsDAOI adao, CheckBalance cb) {
        this.adao= adao;
        this.cb = cb;
    }
    public boolean withdraw(int accNo, double withdrawAmount) {
        System.out.println("In withdraw account number " + accNo + " and withdrawAmount " + withdrawAmount);
        double availableBal = adao.getBalance(accNo);
        if(cb.checkMinBal(accNo, withdrawAmount)) {
            double updatBal =  availableBal - withdrawAmount;
            adao.setBalance(accNo, updatBal);
            return true; 
        } else {
            System.out.println("The request amount is not available");
            return false;
        }
    }
}