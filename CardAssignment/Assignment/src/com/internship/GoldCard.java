package com.internship;

public class GoldCard extends Card {

    public GoldCard(String ownerName, double turnover) {
        super(ownerName, turnover);
    }

    public void setDiscountRate() {
        discountRate = 2;

        if(turnover >= 100){
            double discountGrowth = Math.floor(turnover/100);
            for(int i = 0; i < discountGrowth; i++){
                discountRate += 1;

                // if the discount rate reaches 10 - the for loop stops
                if(i == 7){
                    break;
                }
            }
        }
    }


}
