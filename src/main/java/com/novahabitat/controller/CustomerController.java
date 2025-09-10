package com.novahabitat.controller;

import com.novahabitat.model.Customer;
import com.novahabitat.service.CustomerService;
import com.novahabitat.service.ICustomerService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
//@AllArgsConstructor
@RequiredArgsConstructor
public class CustomerController {
    //@Autowired
    private final ICustomerService service;
    private String atributoEjemplo;

    /*public CustomerController(ICustomerService service) {
        this.service = service;
    }*/

    @GetMapping
    public Customer saveCustomer(){
        //service = new CustomerService();
        //return new Customer(1,"Carlos Valverde");
        return service.validAndSave(new Customer());
    }
}
