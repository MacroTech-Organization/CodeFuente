package edu.udea.macroTech.entities;

import edu.udea.macroTech.utils.GenerateUUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enterprise")
@Getter
@Setter
@AllArgsConstructor
public class Enterprise {

    public Enterprise() {
        this.id = GenerateUUID.createUuid();
    }

    @Id
    @Column(name = "id_enterprise")
    private String id;

    @Column(name = "nit")
    private int nit;

    @Column(name = "name")
    private String name;

    @Column(name = "addres")
    private String addres;

    @Column(name = "phone")
    private String phone;




}
