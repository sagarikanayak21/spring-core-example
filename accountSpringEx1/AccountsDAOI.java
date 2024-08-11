package com.sn.dao;

public interface AccountsDAOI {
    public void setBalance(int accNo, double bal);
    public double getBalance(int accNo);
}