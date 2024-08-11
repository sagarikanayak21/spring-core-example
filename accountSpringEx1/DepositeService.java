package com.sn.service;
import com.sn.dao.*;

// Dummy/Mock implementation

public class DepositeService {
    private AccountsDAOI adao;
    public DepositeService(AccountsDAOI adao) {
        this.adao= adao;
    }
    public boolean deposite(int accNo, double depositeAmount) {
        System.out.println("In deposite account number " + accNo + " and deposite amount " + depositeAmount);
        double availableBal = adao.getBalance(accNo);
        double UpdateBal = availableBal + depositeAmount;
        adao.setBalance(accNo, UpdateBal);
        return true;
    }
}