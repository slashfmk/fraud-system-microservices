package com.creativeslash;


import java.util.List;

public interface CustomerService {

    public Customer createCustomer(CustomerRegistrationRequest customerRegistrationRequest);

    public Customer deleteCustomer(long id);

    public Customer updateCustomer(Customer customer);

    public Customer getCustomer(long id);

    public List<Customer> getAllCustomers ();
}
