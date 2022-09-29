package edu.udea.macroTech.services.impl;

import edu.udea.macroTech.dto.CrearUsuario;
import edu.udea.macroTech.entities.Usuario;
import edu.udea.macroTech.exceptions.ApiException;
import edu.udea.macroTech.exceptions.ErrorRq;
import edu.udea.macroTech.repositorys.UsuarioRepository;
import edu.udea.macroTech.services.UsuarioService;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void crearUsuario(CrearUsuario nuevoUsuario) throws ApiException {

        var usuarioExisteOp = this.usuarioRepository.findByNumeroDocumento(nuevoUsuario.getNumeroDocumento());

        if (usuarioExisteOp.isPresent()) {
            throw  new ApiException(ErrorRq.getErrorRq(HttpStatus.BAD_REQUEST.getReasonPhrase(),
                    "Ya existe un usuario con este NIT",
                    HttpStatus.BAD_REQUEST.value()));
        }


        var usuario = new Usuario();
        usuario.setTipoDocumento(nuevoUsuario.getTipoDocumento());
        usuario.setNumeroDocumento(nuevoUsuario.getNumeroDocumento());
        usuario.setNombres(nuevoUsuario.getNombres());
        usuario.setApellidos(nuevoUsuario.getApellidos());
        usuario.setEmail(nuevoUsuario.getEmail());
        usuario.setPhone(nuevoUsuario.getPhone());
        usuario.setClave(nuevoUsuario.getClave());

        usuarioRepository.save(usuario);

    }
}
