package com.cessidev.cessidev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("")
    public String home(){
        return "<h1>Welcome to spring boot app deployment on railway codelab!</>";
    }
    
}
