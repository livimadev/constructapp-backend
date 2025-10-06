package com.novahabitat.dto;

import com.novahabitat.model.Customer;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

import java.util.Date;

public class ProjectDTO {
    private int idProject;
    private String name;
    private String location;
    private Date startDate;
    private Date estimatedEndDate;
    private String status;
    private Customer customer;
}
