package com.malindu.freshhubcloud.profileservice.service;

import com.malindu.freshhubcloud.commons.model.Customer;
import com.malindu.freshhubcloud.profileservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer register(Customer customer) {
        return customerRepository.save(customer);
    }
}
