package edu.udea.macroTech.controllers;

import edu.udea.macroTech.services.UsuarioService;
import edu.udea.macroTech.services.impl.UsuarioServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminControll {


    @GetMapping("inicio")
    public String index(){
        return "admin/inicio";
    }



    @GetMapping("usuario")
    public String createmov(){
        return "admin/users";
    }


    @GetMapping("movimiento")
    public String create(){
        return "admin/transacciones";
    }



    @GetMapping("empresa")
    public String createEmpresa(){
        return "empresa/empresa";
    }

    @GetMapping("registroempresa")
    public String registroEmpresa(){
        return "empresa/registroEmpresa";
    }


}


