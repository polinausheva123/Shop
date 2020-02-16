package com.internship;

public class BronzeCard extends Card {

    public BronzeCard(String ownerName, double turnover) {
        super(ownerName, turnover);
    }

    // sets the discount rate
    public void setDiscountRate() {
        if(turnover < 100){
            turnover = 0;
        }
        else if(100 <= turnover && turnover >= 300){
            discountRate = 1;
        }
        else{
            discountRate = 2.5;
        }
    }
}
