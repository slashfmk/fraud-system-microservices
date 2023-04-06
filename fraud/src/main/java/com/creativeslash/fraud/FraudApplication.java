package com.creativeslash.fraud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FraudApplication {

    public static void main(String[] args) {
        SpringApplication.run(FraudApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(FraudCheckHistoryRepository fraudCheckHistoryRepository) {

        return args -> {
            fraudCheckHistoryRepository.save(new FraudCheckHistory(1L, true));
        };
    }

}
