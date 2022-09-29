package edu.udea.macroTech.entities;

import edu.udea.macroTech.utils.GenerateUUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "usuario", uniqueConstraints = { @UniqueConstraint(columnNames = { "numero_documento"}) })
@Getter
@Setter
@AllArgsConstructor
public class Usuario {

    public Usuario() {
        this.id = GenerateUUID.createUuid();
    }

    @Id
    @Column(name = "id_usuario")
    private String id;

    @Column(name = "tipo_documento")
    private String tipoDocumento;


    @Column(name = "numero_documento", unique = true)
    private String numeroDocumento;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;


    @Column(name = "clave")
    private String clave;
}
