package edu.udea.macroTech.services;

import edu.udea.macroTech.dto.login.LoginRequest;


public interface LoginService {

    void login(LoginRequest loginPayload);

}
