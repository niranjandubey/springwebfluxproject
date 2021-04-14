package com.niranjan.webflux.controller;

import com.niranjan.webflux.modal.Customer;
import com.niranjan.webflux.services.CustomerService;
import com.niranjan.webflux.utils.CommonFunctions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/home")
public class WelcomeController extends BaseController {

    @Autowired
    CommonFunctions commonFunctions;
    @Autowired
    CustomerService customerService;

    @GetMapping
    public ResponseEntity getHomePage() {
        return commonFunctions.getSuccessMessage("Welcome Home !");
    }

    @GetMapping("/customerData")
    public ResponseEntity getCustomerData() {
        return new ResponseEntity(customerService.getAllCustomer(), HttpStatus.OK);
    }

    @GetMapping("/allCustomerData")
    public Flux<Customer> getAllCustomerData() {
        return customerService.getAllCustomerData();
    }
}
