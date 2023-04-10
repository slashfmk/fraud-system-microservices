package com.creativeslash.fraud;

import org.springframework.stereotype.Service;


@Service
public class FraudCheckHistoryService {

    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

    public FraudCheckHistoryService(FraudCheckHistoryRepository fraudCheckHistoryRepository) {
        this.fraudCheckHistoryRepository = fraudCheckHistoryRepository;
    }

    public FraudCheckHistory addFraud(FraudCheckHistory fraudCheckHistory) {
        return this.fraudCheckHistoryRepository.save(fraudCheckHistory);
    }


}
