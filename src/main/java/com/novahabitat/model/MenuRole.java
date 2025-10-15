package com.novahabitat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(MenuRolePK.class)
public class MenuRole {
    @Id
    private Menu menu;

    @Id
    private Role role;

    /*static class MenuRolePK implements Serializable{
        @ManyToOne
        private Menu menu;
        @ManyToOne
        private Role role;
    }*/
}
