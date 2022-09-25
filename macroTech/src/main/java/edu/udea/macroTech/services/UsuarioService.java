package edu.udea.macroTech.services;

import edu.udea.macroTech.dto.CrearUsuario;
import edu.udea.macroTech.exceptions.ApiException;

public interface UsuarioService {

    void crearUsuario(CrearUsuario nuevoUsuario) throws ApiException;

}
