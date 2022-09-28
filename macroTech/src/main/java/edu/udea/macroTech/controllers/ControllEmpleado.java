package edu.udea.macroTech.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("empleado")
public class ControllEmpleado {

    @GetMapping("transaction")
        public String index(){
            return "empleado/transUsuario";
        }

    @GetMapping("movimiento")
    public String transaccion(){
        return "empleado/usuariomovi";
    }

}

