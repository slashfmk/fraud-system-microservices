package com.creativeslash;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping(path = "api/v1/customers")
@RestController
public class CustomerController {


    @Autowired
    private final CustomerServiceImplement customerService;

    public CustomerController(CustomerServiceImplement customerService) {
        this.customerService = customerService;
    }


    @PostMapping()
    public ResponseEntity<String> registerCustomer(@RequestBody CustomerRegistrationRequest customer) {

        log.info("New customer registered {}", customer);

        var createdCustomer = this.customerService.createCustomer(customer);

        return ResponseEntity.status(HttpStatus.OK).body("User created");
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable long id) {

        var result = this.customerService.deleteCustomer(id);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @GetMapping()
    public ResponseEntity<List<Customer>> getAllCustomers() {
        var customers = this.customerService.getAllCustomers();
        return ResponseEntity.status(HttpStatus.OK).body(customers);
    }

    @PutMapping()
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
        var updatedCustomer = this.customerService.updateCustomer(customer);
        return ResponseEntity.status(HttpStatus.OK).body(updatedCustomer);
    }
}
