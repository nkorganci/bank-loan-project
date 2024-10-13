package com.bank.customer_service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @PostMapping("/apply-loan")
    public String applyLoan(){
        return "Loan applied successfully!";
    }

    @GetMapping("/apply-loan")
    public String getLoan(){
        return "Loan applied successfully!";
    }
}
