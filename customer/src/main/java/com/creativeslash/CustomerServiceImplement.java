package com.creativeslash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImplement implements CustomerService {

    @Autowired
    private final CustomerRepository customerRepository;

    public CustomerServiceImplement(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer createCustomer(CustomerRegistrationRequest customerRegistrationRequest) {

        var newCustomer = new Customer(
                customerRegistrationRequest.firstname(),
                customerRegistrationRequest.lastname(),
                customerRegistrationRequest.email()
        );

        Optional<Customer> customerExist = this.customerRepository.findByEmail(newCustomer.getEmail());

        if(customerExist.isPresent()) throw new IllegalArgumentException("A user with this email already exist");

        this.customerRepository.save(newCustomer);

        return newCustomer;
    }

    @Override
    public Customer deleteCustomer(long id) {

        Optional<Customer> foundCustomer = this.customerRepository.findById(id);

        if (foundCustomer.isEmpty())
            throw new IllegalArgumentException("No user associated with this id");

        this.customerRepository.delete(foundCustomer.get());
        return foundCustomer.get();
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        this.customerRepository.save(customer);
        return customer;
    }

    @Override
    public Customer getCustomer(long id) {
        Optional<Customer> foundCustomer = this.customerRepository.findById(id);

        if (foundCustomer.isEmpty()) throw new IllegalArgumentException("No user associated with this id");
        return foundCustomer.get();
    }

    @Override
    public List<Customer> getAllCustomers() {
        return this.customerRepository.findAll();
    }
}
