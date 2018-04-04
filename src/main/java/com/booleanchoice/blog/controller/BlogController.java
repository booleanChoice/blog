package com.booleanchoice.blog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
class BlogController {

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

}



