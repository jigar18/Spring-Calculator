package com.training.springcalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorRestController {

    @GetMapping("/")
    public String displayHomePage() {
        return "index";
    }
}
