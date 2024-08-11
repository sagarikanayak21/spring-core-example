package com.sn.service;

// Dummy/Mock implementation

public class TAService {
    private DepositeService ds;
    private WithdrawService ws;
    public TAService( DepositeService ds, WithdrawService ws) {
        this.ds= ds;
        this.ws= ws;
    }
    public boolean transferAmount(int srcAccNo, int destAccountNo, double amount) {
        System.out.println("In transferAmount source account number " + srcAccNo + " and destination account " + destAccountNo + " amount " + amount);
       if(ws.withdraw(srcAccNo, amount)) {
        return ds.deposite(destAccountNo, amount);
       }
       return false;
    }
}