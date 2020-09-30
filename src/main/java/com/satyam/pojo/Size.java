package com.satyam.pojo;

public class Size {
    private int sizeID;
    private String sizeName;
    private double price;

    public Size() {
    }

    public Size(int sizeID, String sizeName, double ratio) {
        this.sizeID = sizeID;
        this.sizeName = sizeName;
        this.price = ratio;
    }

    public int getSizeID() {
        return sizeID;
    }

    public void setSizeID(int sizeID) {
        this.sizeID = sizeID;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double ratio) {
        this.price = ratio;
    }
}
