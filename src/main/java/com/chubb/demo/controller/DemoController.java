package com.chubb.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    private ResponseEntity<String> getHello(){
        return ResponseEntity.ok("Hello !!");
    }
}

