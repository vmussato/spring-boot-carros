package com.example.carros.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String get() {
        return "Get Spring boot";
    }

    @PostMapping
    public String post() {
        return "Post Spring boot";
    }

    @PutMapping
    public String put() {
        return "Put Spring boot";
    }

    @DeleteMapping
    public String delete() {
        return "Delete Spring boot";
    }
    
}