package com.novahabitat.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {
    private int idCustomer;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String dni; // DNI /CE / RUC
    private String address;
}
