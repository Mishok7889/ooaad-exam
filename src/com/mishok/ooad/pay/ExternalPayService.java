package com.mishok.ooad.pay;

import com.mishok.ooad.model.PayData;
import com.mishok.ooad.response.PayingResponse;

public interface ExternalPayService {
    /**
     * All pay operation is made with this method
     * <p>
     * There we check if there is
     */
    PayingResponse pay(PayData invoice);
}
