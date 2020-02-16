package com.internship;

public class PayDesk {

    // Prints the data 
    public static void printData(double purchaseValue, Card card){
        System.out.printf("Purchase value: $%.2f\n", purchaseValue);
        System.out.printf("Discount rate: %.1f%%\n", card.getDiscountRate());
        double discount = purchaseValue * (card.getDiscountRate() / 100);
        System.out.printf("Discount: $%.2f\n", discount);
        System.out.printf("Total: $%.2f\n\n", (purchaseValue - discount));
    }

}
