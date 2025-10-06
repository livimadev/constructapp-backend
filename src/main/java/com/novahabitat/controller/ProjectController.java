package com.novahabitat.controller;

import com.novahabitat.model.Project;
import com.novahabitat.service.IProjectService;
import com.novahabitat.service.ISupplierService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class ProjectController {
    private final IProjectService service;

    @GetMapping
    public List<Project> findAll() throws Exception{
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Project findById(@PathVariable("id") Integer id) throws Exception{
        return service.findById(id);
    }

    @PostMapping
    public Project save(@RequestBody Project project) throws Exception{
        return service.save(project);
    }

    @PutMapping("/{id}")
    public Project update(@PathVariable("id") Integer id, @RequestBody Project project) throws Exception{
        return service.update(project, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception{
        service.delete(id);
    }
}
