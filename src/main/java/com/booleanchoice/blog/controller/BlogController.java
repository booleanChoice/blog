package com.booleanchoice.blog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
class BlogController {

    @RequestMapping("/")
    String home() {
        return "home";
    }


}



