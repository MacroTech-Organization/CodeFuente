package edu.udea.macroTech.entities;

import edu.udea.macroTech.utils.GenerateUUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
@Getter
@Setter
@AllArgsConstructor
public class Employee {

    public Employee() {
        this.id = GenerateUUID.createUuid();
    }

    @Id
    @Column(name = "id_empleado")
    private String id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rol", nullable = false)
    private Roles rol;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_enterprise", nullable = false)
    private Enterprise enterprise;


}
