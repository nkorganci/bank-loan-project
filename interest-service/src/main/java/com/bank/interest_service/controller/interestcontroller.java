package com.bank.interest_service.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interests")
public class interestcontroller {

    @PostMapping("/calculateinterest")
    public String calculateInterest(){
        return "interest calculated";
    }
}
