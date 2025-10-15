package com.novahabitat.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;

@Embeddable
@EqualsAndHashCode
public class MenuRolePK {
    @ManyToOne
    @JoinColumn(name = "id_menu", foreignKey = @ForeignKey(name="FK_MENU_ROLE_M"))
    private Menu menu;

    @ManyToOne
    @JoinColumn(name = "id_role", foreignKey = @ForeignKey(name="FK_MENU_ROLE_R"))
    private Role role;
}
