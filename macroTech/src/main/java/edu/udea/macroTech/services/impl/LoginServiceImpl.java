package edu.udea.macroTech.services.impl;

import edu.udea.macroTech.dto.login.LoginRequest;
import edu.udea.macroTech.repositorys.UsuarioRepository;
import edu.udea.macroTech.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void login(LoginRequest loginPayload) {

        var usuarioOp = usuarioRepository.findByNumeroDocumentoAndClave(loginPayload.getUsername(), loginPayload.getPassword());

        if (usuarioOp.isPresent()) {

        } else {

        }
    }
}
