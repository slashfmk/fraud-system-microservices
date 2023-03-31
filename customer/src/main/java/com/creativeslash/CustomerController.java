package com.creativeslash;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;


@Slf4j
@RequestMapping(path = "api/v1/customers")
@RestController
public class CustomerController {


    @PostMapping()
    public ResponseEntity<String> registerCustomer(@RequestBody CustomerRegistrationRequest customer) {

        log.info("New customer registered {}", customer);
        return ResponseEntity.status(HttpStatus.OK).body("User created");
    }


}
