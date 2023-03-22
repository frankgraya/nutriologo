package com.nutri.nut.controller;

import com.nutri.nut.model.Usuario;
import com.nutri.nut.service.RolService;
import com.nutri.nut.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Slf4j
@Controller
public class RegistroUsuario {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private RolService rolService;


    @GetMapping("/register")
    public String RegistroUsuarios(Model model) {
        log.warn("se inicio register debidamente");
        Usuario usuario = new Usuario();
        model.addAttribute("usuario", usuario);
        return "register";
    }

    @PostMapping("/register")
    public String processRegistrationForm(@Valid Usuario usuario, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "register";
        }
        usuarioService.crearUsuario(usuario);
        return "redirect:/users";
    }


}
