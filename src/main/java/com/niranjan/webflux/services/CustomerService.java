package com.niranjan.webflux.services;

import com.niranjan.webflux.dao.CustomerDao;
import com.niranjan.webflux.modal.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerDao customerDao;

    public List<Customer> getAllCustomer() {
        return customerDao.getCustomerData();
    }

    public Flux<Customer> getAllCustomerData() {
        return customerDao.getAllCustomerData();
    }
}
