package com.example.B40API.Models;

public class Family {

    //Attribute
    private int id; /*Primary Key*/
    private short numberOfFamilyMembers;
    private String address;
    private Boolean isB40;

    /*Foreign Key*/
    private int donationId;

    //Constructors

    public Family(int id, short numberOfFamilyMembers, String address, Boolean isB40, int donationId) {
        this.id = id;
        this.numberOfFamilyMembers = numberOfFamilyMembers;
        this.address = address;
        this.isB40 = isB40;
        this.donationId = donationId;
    }


    //Getter
    public int getId() {
        return id;
    }

    public short getNumberOfFamilyMembers() {
        return numberOfFamilyMembers;
    }

    public String getAddress() {
        return address;
    }

    public Boolean getB40() {
        return isB40;
    }

    public int getDonationId() {
        return donationId;
    }


    //Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setNumberOfFamilyMembers(short numberOfFamilyMembers) {
        this.numberOfFamilyMembers = numberOfFamilyMembers;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setB40(Boolean b40) {
        isB40 = b40;
    }

    public void setDonationId(int donationId) {
        this.donationId = donationId;
    }

    //ToString
    @Override
    public String toString() {
        return "Family{" +
                "id=" + id +
                ", numberOfFamilyMembers=" + numberOfFamilyMembers +
                ", address='" + address + '\'' +
                ", isB40=" + isB40 +
                ", donationId=" + donationId +
                '}';
    }
}
