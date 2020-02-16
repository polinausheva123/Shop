package com.internship;

public class Main {

    public static void main(String[] args) {

        String ownerName = "Rositca Petrova";
        double turnover = 0;
        BronzeCard bronzeCard = new BronzeCard(ownerName, turnover);
        bronzeCard.setDiscountRate();
        double purchaseValue = 150;
        PayDesk.printData(purchaseValue, bronzeCard);

        ownerName = "Ivan Kirilov";
        turnover = 600;
        SilverCard silverCard = new SilverCard(ownerName, turnover);
        silverCard.setDiscountRate();
        purchaseValue = 850;
        PayDesk.printData(purchaseValue, silverCard);

        ownerName = "Kaloyan Petrov";
        turnover = 1500;
        GoldCard goldCard = new GoldCard(ownerName, turnover);
        goldCard.setDiscountRate();
        purchaseValue = 1300;
        PayDesk.printData(purchaseValue, goldCard);
    }
}
