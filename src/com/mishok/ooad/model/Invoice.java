package com.mishok.ooad.model;

import com.mishok.ooad.enums.PayPeriod;
import com.mishok.ooad.enums.PayStatus;
import com.mishok.ooad.enums.PayType;

public class Invoice {
    Rate rate;
    PayPeriod period;
    //Auto or manual
    PayType payType;
    //null if type is manual
    CardData cardData;
    PayStatus payStatus;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    User user;

    public Invoice() {

    }

    public Invoice(Rate rate, PayPeriod period, PayType payType, CardData cardData, PayStatus payStatus, User user) {
        this.rate = rate;
        this.period = period;
        this.payType = payType;
        this.cardData = cardData;
        this.payStatus = payStatus;
        this.user = user;
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public PayPeriod getPeriod() {
        return period;
    }

    public void setPeriod(PayPeriod period) {
        this.period = period;
    }

    public PayType getPayType() {
        return payType;
    }

    public void setPayType(PayType payType) {
        this.payType = payType;
    }

    public CardData getCardData() {
        return cardData;
    }

    public void setCardData(CardData cardData) {
        this.cardData = cardData;
    }

    public PayStatus getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(PayStatus payStatus) {
        this.payStatus = payStatus;
    }
}