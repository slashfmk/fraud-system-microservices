package com.creativeslash.fraud;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/v1/fraud")
public class FraudCheckHistoryController {

    @Autowired
    private FraudCheckHistoryService fraudCheckHistoryService;

    public FraudCheckHistoryController(FraudCheckHistoryService fraudCheckHistoryService) {
        this.fraudCheckHistoryService = fraudCheckHistoryService;
    }


    @PostMapping()
    public ResponseEntity<String> createFraud(@RequestBody FraudCheckHistory fraudCheckHistory) {

        return ResponseEntity.status(HttpStatus.OK).body("Registered");
    }

    @PutMapping()
    public ResponseEntity<String> updateFraud() {

        return ResponseEntity.status(HttpStatus.OK).body("Fraud successfully updated");
    }

}