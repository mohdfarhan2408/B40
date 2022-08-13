package com.example.B40API.Models;

import java.time.LocalDateTime;
import java.util.List;

public class FamilyMembers {

    //Constructors
    private int id; /*Primary key*/
    private String firstName;
    private String lastName;
    private String icNumber;
    private int age;
    private LocalDateTime dateOfBirth;
    private String occupation;
    private Float lat;
    private Float lon;
    private Double monthlyIncome;
    private String maritalStatus;
    private String gender;

    private List<BankAccount> bankAccounts;
    private List<FoodPreference> foodPreferences;
    private List<MedicalCondition> medicalConditions;

    /*Foreign Key*/
    private int familyId;


    //Constructor
    public FamilyMembers(int id, String firstName, String lastName, String icNumber, int age, LocalDateTime dateOfBirth, String occupation, Float lat, Float lon, Double monthlyIncome, String maritalStatus, String gender, int familyId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.icNumber = icNumber;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.occupation = occupation;
        this.lat = lat;
        this.lon = lon;
        this.monthlyIncome = monthlyIncome;
        this.maritalStatus = maritalStatus;
        this.gender = gender;
        this.familyId = familyId;
    }


    //Getter
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIcNumber() {
        return icNumber;
    }

    public int getAge() {
        return age;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public String getOccupation() {
        return occupation;
    }

    public Float getLat() {
        return lat;
    }

    public Float getLon() {
        return lon;
    }

    public Double getMonthlyIncome() {
        return monthlyIncome;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getGender() {
        return gender;
    }

    public int getFamilyId() {
        return familyId;
    }


    //Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIcNumber(String icNumber) {
        this.icNumber = icNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public void setMonthlyIncome(Double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFamilyId(int familyId) {
        this.familyId = familyId;
    }

    @Override
    public String toString() {
        return "FamilyMembers{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", icNumber='" + icNumber + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", occupation='" + occupation + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", monthlyIncome=" + monthlyIncome +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", gender='" + gender + '\'' +
                ", familyId=" + familyId +
                '}';
    }
}
