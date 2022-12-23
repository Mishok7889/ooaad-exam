package com.mishok.ooad.repository;

import com.mishok.ooad.model.Rate;

public class RateRepository {
    /**
     * Get rate from db.
     */
    public Rate getRateById(long id){
        return new Rate();
    };
}
