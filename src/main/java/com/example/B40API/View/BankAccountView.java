package com.example.B40API.View;

import java.sql.SQLOutput;

public class BankAccountView {

    public void printBankAccount(String name, String accountNumber, Double debt, Double creditRating) {
        System.out.println("Bank Account Information:");
        System.out.println("Bank Name:" + name);
        System.out.println("Account Number:" + accountNumber);
        System.out.println("Debt:" + debt);
        System.out.println("Credit Score:" +creditRating);
    }
}
