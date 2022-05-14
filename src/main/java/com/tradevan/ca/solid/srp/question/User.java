package com.tradevan.ca.solid.srp.question;

public class User {

    private int id;

    private int phoneNumber;
    private String primaryEmail;
    private String secondaryEmail;
    private Role role;
    private int dollarsAmount;

    public User() {
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(String newSecondaryEmail) {
        this.secondaryEmail = newSecondaryEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public void sendMoney(User userTo, int dollarsAmount) {
        // some code here to transfer money
        userTo.setDollarsAmount(userTo.getDollarsAmount() + dollarsAmount);
        this.dollarsAmount -= dollarsAmount;
    }

    public Role getRole() {
        return this.role;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDollarsAmount(int dollarsAmount) {
        this.dollarsAmount = dollarsAmount;
    }

    public int getDollarsAmount() {
        return dollarsAmount;
    }
}
