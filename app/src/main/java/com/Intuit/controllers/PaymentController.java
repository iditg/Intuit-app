package com.Intuit.controllers;

import com.Intuit.database.entities.NewPaymentRequest;
import com.Intuit.facad.PaymentService;
import com.Intuit.facad.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    private PaymentService paymentService;
    private UserService usersService;

    private final Producer producer;



    public PaymentController(PaymentService paymentService,UserService usersService,Producer producer) {
        this.paymentService = paymentService;
        this.usersService=usersService;
        this.producer = producer;
    }

    @PostMapping(path = "/newPayment")
    public ResponseEntity createNewPayment(@Validated @RequestBody NewPaymentRequest paymentRequest) throws Exception {
        this.producer.sendMessage(paymentRequest);
        paymentService.addPayment(paymentRequest);
        return ResponseEntity.ok(1);
    }


}
