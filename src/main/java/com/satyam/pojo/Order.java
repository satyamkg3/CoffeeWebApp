package com.satyam.pojo;

import java.util.Objects;

public class Order {

    private int orderID;
    private int coffeeID;
    private int sizeID;
    private int addOnsID;
    private int couponID;

    public Order() {
    }


    public Order(int orderID, int coffeeID, int sizeID, int addOnsID, int couponID) {
        this.orderID = orderID;
        this.coffeeID = coffeeID;
        this.sizeID = sizeID;
        this.addOnsID = addOnsID;
        this.couponID = couponID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getCoffeeID() {
        return coffeeID;
    }

    public void setCoffeeID(int coffeeID) {
        this.coffeeID = coffeeID;
    }

    public int getSizeID() {
        return sizeID;
    }

    public void setSizeID(int sizeID) {
        this.sizeID = sizeID;
    }

    public int getAddOnsID() {
        return addOnsID;
    }

    public void setAddOnsID(int addOnsID) {
        this.addOnsID = addOnsID;
    }

    public int getCouponID() {
        return couponID;
    }

    public void setCouponID(int couponID) {
        this.couponID = couponID;
    }



}
