package com.satyam.pojo;


public class Coffee {
    private int coffeeID;
    private String coffeeName;
    private double price;

    public Coffee() {
    }

    public Coffee(int coffeeID, String coffeeName, double price) {
        this.coffeeID = coffeeID;
        this.coffeeName = coffeeName;
        this.price = price;
    }

    public int getCoffeeID() {
        return coffeeID;
    }

    public void setCoffeeID(int coffeeID) {
        this.coffeeID = coffeeID;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
