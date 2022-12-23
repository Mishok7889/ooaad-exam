package com.mishok.ooad.service;

import com.mishok.ooad.model.Rate;
import com.mishok.ooad.repository.RateRepository;

public class RateService {
    private RateRepository rateRepository;

    public Rate getRateById(long id){
        return rateRepository.getRateById(id);
    }
}
