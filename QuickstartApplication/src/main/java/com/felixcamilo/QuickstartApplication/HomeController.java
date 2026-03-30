package com.felixcamilo.QuickstartApplication;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

    @GetMapping(path = "/")
    public String Home(){
        return "I'm learning so much";
    }
}
