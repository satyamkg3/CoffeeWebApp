package com.satyam.pojo;

public class Discount {
    private int couponID;
    private String couponName;
    private int minCost;
    private int percentage;

    public Discount() {
    }

    public Discount(int couponID, String couponName, int minCost, int percentage) {
        this.couponID = couponID;
        this.couponName = couponName;
        this.minCost = minCost;
        this.percentage = percentage;
    }

    public int getCouponID() {
        return couponID;
    }

    public void setCouponID(int couponID) {
        this.couponID = couponID;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public int getMinCost() {
        return minCost;
    }

    public void setMinCost(int minCost) {
        this.minCost = minCost;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }
}
