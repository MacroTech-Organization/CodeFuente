package edu.udea.macroTech.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CrearUsuario implements Serializable {

    private static final long serialVersionUID = 0L;



    private String tipoDocumento;

    private String numeroDocumento;

    private String nombres;

    private String apellidos;

    private String email;

    private String phone;

    private String clave;
}
