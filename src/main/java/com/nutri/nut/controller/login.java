package com.nutri.nut.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class login {

    @GetMapping("/login")
    public String login() {
        log.warn("se inicio login debidamente");
        return "login";
    }
}
