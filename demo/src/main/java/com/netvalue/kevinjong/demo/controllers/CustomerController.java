package com.netvalue.kevinjong.demo.controllers;


import com.netvalue.kevinjong.demo.models.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
    private List<Customer> customers = new ArrayList<>();

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        customers.add(customer);
        return customer;
    }
}
