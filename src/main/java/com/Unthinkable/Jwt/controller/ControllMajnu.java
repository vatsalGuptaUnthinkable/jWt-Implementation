package com.Unthinkable.Jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllMajnu {

@GetMapping("/")
    public String hello(){
    return "<h1>Yo What's up my Boy <h1/>";
}

}
