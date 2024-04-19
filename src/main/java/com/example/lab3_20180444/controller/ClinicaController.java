package com.example.lab3_20180444.controller;


import com.example.lab3_20180444.Entity.Clinica;
import com.example.lab3_20180444.repository.ClinicaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/clinica")
public class ClinicaController {
    final ClinicaRepository clinicaRepository;

public ClinicaController(ClinicaRepository clinicaRepository){
this.clinicaRepository = clinicaRepository;
}

@GetMapping(value = {"/list",""})
public String listarClinicas(Model model){
    List<Clinica> lista = clinicaRepository.findAll();
    model.addAttribute("listClinica",lista);
    return "clinica/tablasclinicas";
}
}
