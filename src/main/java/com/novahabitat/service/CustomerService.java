package com.novahabitat.service;

import com.novahabitat.model.Customer;
import com.novahabitat.repository.CustomerRepository;
import com.novahabitat.repository.ICustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService implements ICustomerService{

    //@Autowired
    private final ICustomerRepository repo;

    /*public CustomerService(ICustomerRepository repo) {
        this.repo = repo;
    }*/

    @Override
    public Customer validAndSave(Customer customer){
        //repo = new CustomerRepository();
        return repo.save(customer);
    }

}
