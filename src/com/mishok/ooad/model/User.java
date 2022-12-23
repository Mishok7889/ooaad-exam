package com.mishok.ooad.model;

import com.mishok.ooad.enums.PayPeriod;
import com.mishok.ooad.enums.PayType;

public class User {
    long id;
    CardData[] cards;
    Rate currentRate;
    PayPeriod currentPeriod;
    PayType payType;
    boolean suspended;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CardData[] getCards() {
        return cards;
    }

    public void setCards(CardData[] cards) {
        this.cards = cards;
    }

    public Rate getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(Rate currentRate) {
        this.currentRate = currentRate;
    }

    public PayPeriod getCurrentPeriod() {
        return currentPeriod;
    }

    public void setCurrentPeriod(PayPeriod currentPeriod) {
        this.currentPeriod = currentPeriod;
    }

    public PayType getPayType() {
        return payType;
    }

    public void setPayType(PayType payType) {
        this.payType = payType;
    }

    public boolean isSuspended() {
        return suspended;
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }
}
