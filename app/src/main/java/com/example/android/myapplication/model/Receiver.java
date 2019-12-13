package com.example.android.myapplication.model;

public class Receiver {
    public String id;
    public String name;
    public String email;
    public String phoneNumber;
    public String address;
    public int numberOfPeople;
    public boolean canCallect;

    public Receiver(String name, String email, String phoneNumber, String address, int numberOfPeople, boolean canCallect) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.numberOfPeople = numberOfPeople;
        this.canCallect = canCallect;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public boolean isCanCallect() {
        return canCallect;
    }

    public void setCanCallect(boolean canCallect) {
        this.canCallect = canCallect;
    }

}
