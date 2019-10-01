package com.training.springcalculator.controller;

import com.training.springcalculator.domain.Calculator;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorRestController {

    //private Calculator calculator;

    @GetMapping
    public String displayHomePage(Model model) {
        Calculator calculator = new Calculator();
        model.addAttribute("calculator", calculator);
        return "index";
    }
}
