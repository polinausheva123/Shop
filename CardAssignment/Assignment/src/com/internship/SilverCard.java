package com.internship;

public class SilverCard extends Card {
    public SilverCard(String ownerName, double turnover) {
        super(ownerName, turnover);
    }

    public void setDiscountRate() {
        discountRate = 2;

        if(turnover>300){
            discountRate = 3.5;
        }
    }
}
