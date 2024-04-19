package com.example.lab3_20180444.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String paginaPrincipal(){
        return "hola mundo";
    }

    @RequestMapping(value = "/holamundo", method = RequestMethod.GET)
    public String holaMundo(){
        return "hola";
    }

    @RequestMapping(value = "/tablaClinicas", method = RequestMethod.GET)
    public String tablaClinicas(){
        return "tablasClínicas";
    }
}
