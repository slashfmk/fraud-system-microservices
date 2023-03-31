package com.creativeslash;


import java.util.List;

public interface CustomerService {

    public void createCustomer();

    public void deleteCustomer();

    public Customer updateCustomer();

    public Customer getCustomer();

    public List<Customer> getAllCustomers ();
}
