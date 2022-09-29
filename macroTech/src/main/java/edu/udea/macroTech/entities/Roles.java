package edu.udea.macroTech.entities;

import edu.udea.macroTech.utils.GenerateUUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
@Getter
@Setter
@AllArgsConstructor
public class Roles {

    public Roles() {
        this.id = GenerateUUID.createUuid();
    }

    @Id
    @Column(name = "id_rol")
    private String id;

    @Column(name = "name_rol")
    private String nameRol;


}
