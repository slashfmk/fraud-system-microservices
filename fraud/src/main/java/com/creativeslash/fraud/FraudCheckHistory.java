package com.creativeslash.fraud;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FraudCheckHistory {

    @Id
    @SequenceGenerator(
            name = "fraud_id_sequence",
            sequenceName = "fraud_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "fraud_id_sequence"
    )
    private Long id;
    private Long customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;

    public FraudCheckHistory(Long customerId, Boolean isFraudster) {
        this.customerId = customerId;
        this.isFraudster = isFraudster;
        this.createdAt = LocalDateTime.now();
    }
}
