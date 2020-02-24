package com.Intuit.controllers;
import com.Intuit.database.entities.PaymentMeyhod;
import com.Intuit.facad.PaymentMethodService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/paymentMethod")
public class PaymentMethodController {
    private final PaymentMethodService paymentMethodService;

    public PaymentMethodController(PaymentMethodService paymentMethodService) {
        this.paymentMethodService = paymentMethodService;
    }

    @GetMapping(value = "/{paymentMethodId}", produces = APPLICATION_JSON_VALUE)
    public PaymentMeyhod paymentMethodById(@PathVariable("paymentMethodId") Integer paymentMethodId) throws Exception {
        return paymentMethodService.getById(paymentMethodId);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<PaymentMeyhod> getAllPaymentsMethodsInfo() throws Exception {
        return paymentMethodService.getAllInfo();
    }

}
