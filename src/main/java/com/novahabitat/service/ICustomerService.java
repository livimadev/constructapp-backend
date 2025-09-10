package com.novahabitat.service;

import com.novahabitat.model.Customer;

public interface ICustomerService {
    Customer validAndSave(Customer customer);
}
