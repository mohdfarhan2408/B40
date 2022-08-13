package com.example.B40API.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Donation {

    //Attributes
    @Id
    @GeneratedValue
    private int id;
    private double donationAmount;
    private String donationItems;

    //Constructor
    public Donation(int id, double donationAmount, String donationItems) {
        this.donationAmount = donationAmount;
        this.donationItems = donationItems;
    }

    public Donation(double donationAmount, String donationItems) {
        this.donationAmount = donationAmount;
        this.donationItems = donationItems;
    }

    public Donation() {

    }

    //Getter
    public int getId() {
        return id;
    }

    public double getDonationAmount() {
        return donationAmount;
    }

    public String getDonationItems() {
        return donationItems;
    }

    //Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setDonationAmount(double donationAmount) {
        this.donationAmount = donationAmount;
    }

    public void setDonationItems(String donationItems) {
        this.donationItems = donationItems;
    }

    //ToString
    @Override
    public String toString() {
        return "Donation{" +
                "id=" + id +
                ", donationAmount=" + donationAmount +
                ", donationItems='" + donationItems + '\'' +
                '}';
    }
}
