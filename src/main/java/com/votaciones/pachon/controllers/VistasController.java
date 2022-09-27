package com.votaciones.pachon.controllers;

import com.votaciones.pachon.dto.CandidatosEntity;
import com.votaciones.pachon.dto.UsuarioEntity;
import com.votaciones.pachon.services.CandidatoService;
import com.votaciones.pachon.services.UsuarioService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Log4j2
public class VistasController {

    @Autowired
    private CandidatoService candidatoService;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String getLogin(Model login){
        login.addAttribute("usuario", new UsuarioEntity());
        return "login";
    }

    @PostMapping("/login")
    public String validarLogin(@ModelAttribute UsuarioEntity usuario, RedirectAttributes redirectAttributes){

        if(usuarioService.existeUsuario(usuario.getNumeroIdentificacion())){
           return "redirect:/votar";
        }else {
            redirectAttributes.addFlashAttribute("mensaje", "Identificacion no existente");
            return "redirect:/login";
        }



    }

    @GetMapping("/admin")
    public String getAdmin(Model admin){
        return "admin";
    }

    @GetMapping("/votar")
    public String getVotaciones(Model votaciones){
        votaciones.addAttribute("candidatos", candidatoService.listaCandidatos());
        //votaciones.addAttribute("usuario", usuarioService.listarUsuario(votaciones.getAttribute("identificacion").toString()))

        return "votaciones";
    }

    @PostMapping("/votar/{numero}")
    public String guardarVoto(@ModelAttribute CandidatosEntity candidatos, @PathVariable("numero") String numero){

        //candidatoService.guardarVoto(candidato.getNumeroVoto());
        log.warn(numero);

        return "redirect:/login";
    }
}
