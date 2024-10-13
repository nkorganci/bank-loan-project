package com.bank.payment_service.paymentcontroller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class paymentcontroller {

    @PostMapping("/payment")
    public String setPayments(){
        return "payment send";
    }
}
