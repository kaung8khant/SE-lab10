package edu.miu.cs.cs425.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = {"/", "/home"})
    public String index() {
        return "public/index";
    }
}
