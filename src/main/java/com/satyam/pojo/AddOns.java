package com.satyam.pojo;

public class AddOns {

    private int addOnsID;
    private String addOnsName;
    private double price;

    public AddOns() {
    }

    public AddOns(int addOnsID, String addOnsName, double price) {
        this.addOnsID = addOnsID;
        this.addOnsName = addOnsName;
        this.price = price;
    }

    public int getAddOnsID() {
        return addOnsID;
    }

    public void setAddOnsID(int addOnsID) {
        this.addOnsID = addOnsID;
    }

    public String getAddOnsName() {
        return addOnsName;
    }

    public void setAddOnsName(String addOnsName) {
        this.addOnsName = addOnsName;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
