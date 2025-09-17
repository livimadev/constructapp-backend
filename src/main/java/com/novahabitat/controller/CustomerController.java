package com.novahabitat.controller;

import com.novahabitat.dto.CustomerDTO;
import com.novahabitat.model.Customer;
import com.novahabitat.service.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/customers")
//@AllArgsConstructor
@RequiredArgsConstructor
public class CustomerController {
    //@Autowired
    private final ICustomerService service;

    @GetMapping
    public ResponseEntity<List<CustomerDTO>> findAll() throws Exception{
        //List<CustomerDTO> list = service.findAll().stream().map(e -> new CustomerDTO(e.getIdCustomer(),e.getFirstName(), e.getLastName(), e.getPhone(), e.getEmail(), e.getDni(), e.getAddress())).toList();
        ModelMapper modelMapper = new ModelMapper();
        List<CustomerDTO> list = service.findAll().stream().map(e -> modelMapper.map(e, CustomerDTO.class)).toList();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findById(@PathVariable("id") Integer id) throws Exception{
        Customer obj =  service.findById(id);
        return ResponseEntity.ok(obj);
    }

    @PostMapping
    public ResponseEntity<Customer>  save(@RequestBody Customer customer) throws Exception{
        Customer obj =  service.save(customer);
        //return ResponseEntity.ok(obj);
        // localhost:8080/customers/{id}
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(obj.getIdCustomer()).toUri();
        return ResponseEntity.created(location).build();
        //return new ResponseEntity<>(obj, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> update(@PathVariable("id") Integer id, @RequestBody Customer customer) throws Exception{
        Customer obj = service.update(customer, id);
        return ResponseEntity.ok(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) throws Exception{
        service.delete(id);
        return ResponseEntity.noContent().build();
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
