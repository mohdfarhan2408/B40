package com.example.B40API.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BankAccount {

    //Attributes
    @Id
    @GeneratedValue
    private int id; /*Primary key*/
    private String bankName;
    private String accountNumber;
    private Double debt;
    private Double creditRating;


    /*Foreign Key*/
    private int ownerID;

    //Constructor
    public BankAccount(int id, String name, String accountNumber, Double debt, Double creditRating, int ownerID) {
        this.id = id;
        this.bankName = name;
        this.accountNumber = accountNumber;
        this.debt = debt;
        this.creditRating = creditRating;
        this.ownerID = ownerID;
    }

    public BankAccount(String bankName, String accountNumber, Double debt, Double creditRating) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.debt = debt;
        this.creditRating = creditRating;
    }

    public BankAccount() {
    }


    //Getter

    public int getId() {
        return id;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Double getDebt() {
        return debt;
    }

    public Double getCreditRating() {
        return creditRating;
    }

    public int getOwnerID() {
        return ownerID;
    }


    //Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setDebt(Double debt) {
        this.debt = debt;
    }

    public void setCreditRating(Double creditRating) {
        this.creditRating = creditRating;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", name='" + bankName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", debt=" + debt +
                ", creditRating=" + creditRating +
                ", ownerID=" + ownerID +
                '}';
    }
}
