package com.mishok.ooad.model;

/**
 * There you can store information about card
 */
public class CardData {
    public CardData(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    String cardNumber;
}
