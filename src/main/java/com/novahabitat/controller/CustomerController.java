package com.novahabitat.controller;

import com.novahabitat.model.Customer;
import com.novahabitat.service.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
//@AllArgsConstructor
@RequiredArgsConstructor
public class CustomerController {
    //@Autowired
    private final ICustomerService service;

    @GetMapping
    public List<Customer> findAll() throws Exception{
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Customer findById(@PathVariable("id") Integer id) throws Exception{
        return service.findById(id);
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer) throws Exception{
        return service.save(customer);
    }

    @PutMapping("/{id}")
    public Customer update(@PathVariable("id") Integer id, @RequestBody Customer customer) throws Exception{
        return service.update(customer, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception{
        service.delete(id);
    }
    
    /*public CustomerController(ICustomerService service) {
        this.service = service;
    }*/

    /*
    @GetMapping
    public Customer saveCustomer(){
        //service = new CustomerService();
        //return new Customer(1,"Carlos Valverde");
        return service.validAndSave(new Customer());
    }
    
     */
}
