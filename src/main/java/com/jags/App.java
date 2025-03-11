package com.jags;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        AccountInt actualAccount = new AccountImpl();
        actualAccount.Deposit(1000);
    }
}
