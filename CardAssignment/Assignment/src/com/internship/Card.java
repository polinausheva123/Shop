package com.internship;

public abstract class Card {

    // owner
    protected String ownerName;

    // the turnover for the previous month
    protected double turnover;

    // discount rate
    protected double discountRate;

    public Card(String ownerName, double turnover) {
        this.ownerName = ownerName;
        this.turnover = turnover;
        this.discountRate = 0;
    }

    // sets the discount rate in every class
    public abstract void setDiscountRate();

    // returns the discount rate
    public double getDiscountRate() {
        return discountRate;
    }
}
