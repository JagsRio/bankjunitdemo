package com.jags;

public interface AccountInt {

    public void Deposit(double amount);
    public void WithDraw(double amount);
    public double GetBalance();
    public boolean CheckAmountValidity(double amount);
    public boolean IsBalanceLessThanWithDrawAmount(double amount);
    
}