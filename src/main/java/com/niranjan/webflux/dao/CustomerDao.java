package com.niranjan.webflux.dao;

import com.niranjan.webflux.modal.Customer;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class CustomerDao {

    public List<Customer> getCustomerData() {
        List<Customer> customers = new ArrayList();
        IntStream.range(1, 50).peek(i -> System.out.println("Processing Row :: " + i)).forEach(i -> customers.add(new Customer("" + i, "customer" + i)));
        return customers;
    }

    public Flux<Customer> getAllCustomerData() {
        List<Customer> customers = new ArrayList();
        IntStream.range(1, 50).peek(i -> System.out.println("Processing Row :: " + i)).forEach(i -> customers.add(new Customer("" + i, "customer" + i)));
        Flux<Customer> customerFlux = Flux.fromStream(customers.stream());
        return customerFlux;
    }
}
