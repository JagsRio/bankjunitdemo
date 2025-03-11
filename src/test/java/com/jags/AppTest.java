package com.jags;
import org.junit.jupiter.api.*;


public class AppTest 
{
    public static AccountInt accountTTest;

    @BeforeAll
    public static void setup(){
        accountTTest = new AccountImpl();
        System.out.println("This is run before all the tests");
    }

    @Test
    public void amountDeposit_addedToBalance(){
        double actual = accountTTest.GetBalance() + (1000);
        accountTTest.Deposit(1000.0);
        double expected = accountTTest.GetBalance();
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void amountWithdraw_removedFromBalance(){
        double actual = accountTTest.GetBalance() - 50.0;
        accountTTest.WithDraw(50);
        double expected = accountTTest.GetBalance();
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void amountLessThanZero(){
        Assertions.assertFalse(accountTTest.CheckAmountValidity(-100), "Amount is negative");
    }

    @Test
    public void notEnoughBalance_ToWithDraw(){
        Assertions.assertFalse(accountTTest.IsBalanceLessThanWithDrawAmount(1000), "Balance is less than withdraw amount");
    }

}
