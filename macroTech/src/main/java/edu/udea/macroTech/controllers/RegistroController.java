package edu.udea.macroTech.controllers;

import edu.udea.macroTech.dto.CrearUsuario;
import edu.udea.macroTech.exceptions.ApiException;
import edu.udea.macroTech.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("registro")
public class RegistroController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("nuevo")
    public String registro(Model model){
        model.addAttribute("nuevoUsuario", new CrearUsuario());
        return  "registro/registro";
    }

    @PostMapping("crear-usuario")
    public String crearUsuario(@ModelAttribute("nuevoUsuario") CrearUsuario nuevo) throws ApiException {

        usuarioService.crearUsuario(nuevo);

        return "login/login";
    }
}
