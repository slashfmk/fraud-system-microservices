package com.creativeslash.fraud;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FraudCheckHistoryService {


    @Autowired
    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;

    public FraudCheckHistoryService(FraudCheckHistoryRepository fraudCheckHistoryRepository) {
        this.fraudCheckHistoryRepository = fraudCheckHistoryRepository;
    }

    public FraudCheckHistory addFraud(FraudCheckHistory fraudCheckHistory) {
        return this.fraudCheckHistoryRepository.save(fraudCheckHistory);
    }


}
