package com.store.online.customerservice.service;

import com.store.online.customerservice.entity.Customer;
import com.store.online.customerservice.entity.Region;

import java.util.List;

public interface CustomerService {
    public Customer getCustomer(Long id);
    public Customer createCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public Customer deleteCustomer(Long id);
    public List<Customer> findCustomerAll();
    public List<Customer> findCustomerByRegion(Region region);

}
