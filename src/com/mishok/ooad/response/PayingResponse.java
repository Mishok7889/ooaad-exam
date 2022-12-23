package com.mishok.ooad.response;

import com.mishok.ooad.model.Invoice;

public class PayingResponse {
    public PayingResponse(String response, boolean isSuccess) {
        this.response = response;
        this.isSuccess = isSuccess;
    }

    String response;
    boolean isSuccess;
}
