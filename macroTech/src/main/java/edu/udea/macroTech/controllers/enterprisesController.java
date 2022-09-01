package edu.udea.macroTech.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class enterprisesController {

    @RequestMapping("index")
    public String index(){

        return "index";
    }

    }



