package com.example.B40API.Models;

public class CashDonation implements Donation2{

    //Attributes
    public String donationItems;
    public String donationAmount;


    //Constructor
    @Override
    public void donate() {
        System.out.println("Donation Items: " + donationItems);
        System.out.println("Donation Amount: " + donationAmount);
    }

}
