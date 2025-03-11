package com.jags;

public class AccountImpl implements AccountInt {
    
    double balanceAmount = 0.0;

    @Override
    public void Deposit(double amount){
        if (this.CheckAmountValidity(amount)){
            balanceAmount = balanceAmount + amount;    
        }
        else{
            throw new RuntimeException("Amount to withdraw is invalid");
        }
    }

    @Override
    public void WithDraw(double amount){
        if (this.CheckAmountValidity(amount)){
            if (IsBalanceLessThanWithDrawAmount(amount)){
                balanceAmount = balanceAmount - amount;
            }
            else {
                throw new RuntimeException("You do not have emough balance to withdraw");
            }
        }
        else {
            throw new RuntimeException("Amount to withdraw is invalid");
        }
    }

    @Override
    public double GetBalance(){
        if (balanceAmount<0){
            throw new RuntimeException("Balance is less than zero. Please deposit money");
        }
        return balanceAmount;
    }

    @Override
    public boolean CheckAmountValidity(double amount){
        if (amount <= 0){
            return false;
        }
        return true;
    }

    @Override
    public boolean IsBalanceLessThanWithDrawAmount(double amount){
        if (this.GetBalance() < amount)
        {
            return false;
        }
        return true;
    }

}
