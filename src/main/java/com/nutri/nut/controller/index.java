package com.nutri.nut.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class index {


    @GetMapping("/")
    public String index(Model model) {
        log.warn("se inicio index debidamente");
        return "index";
    }
}
