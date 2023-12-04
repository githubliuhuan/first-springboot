package com.qf.firstspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {


    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("name","张三");
        return "index";
    }
}
