package com.entities;

public class Passenger {

    private String passengerId;
    private String name, userName, gender, address, phoneNo;

    // Constructors
    public Passenger() {
        // Blank constructor
    }
    public Passenger(String passengerId, String name, String userName, String gender, String address, String phoneNo) {
        this.passengerId = passengerId;
        this.name = name;
        this.userName = userName;
        this.gender = gender;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    // Getters
    public String getPassengerId() {
        return passengerId;
    }
    public String getName() {
        return name;
    }
    public String getUserName() {
        return userName;
    }
    public String getGender() {
        return gender;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNo() {
        return phoneNo;
    }

    // Setters
    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
