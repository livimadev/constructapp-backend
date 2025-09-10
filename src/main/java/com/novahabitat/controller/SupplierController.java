package com.novahabitat.controller;

import com.novahabitat.model.Supplier;
import com.novahabitat.service.ICustomerService;
import com.novahabitat.service.ISupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suppliers")
@RequiredArgsConstructor
public class SupplierController {
    private final ISupplierService service;

    @GetMapping
    public List<Supplier> findAll() throws Exception{
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Supplier findById(@PathVariable("id") Integer id) throws Exception{
        return service.findById(id);
    }

    @PostMapping
    public Supplier save(@RequestBody Supplier supplier) throws Exception{
        return service.save(supplier);
    }

    @PutMapping("/{id}")
    public Supplier update(@PathVariable("id") Integer id, @RequestBody Supplier supplier) throws Exception{
        return service.update(supplier, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception{
        service.delete(id);
    }
}
