package com.novahabitat.service.implementation;

import com.novahabitat.model.Customer;
import com.novahabitat.repository.ICustomerRepository;
import com.novahabitat.repository.IGenericRepository;
import com.novahabitat.service.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService extends GenericService<Customer, Integer> implements ICustomerService {
    //@Autowired
    private final ICustomerRepository repo;

    @Override
    protected IGenericRepository<Customer, Integer> getRepo() {
        return repo;
    }

    /*
    @Override
    public Customer save(Customer customer) throws Exception {
        return repo.save(customer);
    }

    @Override
    public Customer update(Customer customer, Integer id) throws Exception {
        // EVALUACION CON EL ID
        // API REFLEXION
        customer.setIdCustomer(id);
        return repo.save(customer);
    }

    @Override
    public List<Customer> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Customer findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Customer());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
     */

    /*public CustomerService(ICustomerRepository repo) {
        this.repo = repo;
    }*/

    /*
    @Override
    public Customer validAndSave(Customer customer){
        //repo = new CustomerRepository();
        return repo.save(customer);
    }
*/
}
