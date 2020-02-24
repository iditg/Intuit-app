package com.Intuit.controllers;
import com.Intuit.database.entities.Payee;
import com.Intuit.database.entities.PaymentMeyhod;
import com.Intuit.facad.PayeeService;
import com.Intuit.facad.PaymentMethodService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/payees")
public class PayeeController {
    private final PayeeService payeeService;

    public PayeeController(PayeeService payeeService) {
        this.payeeService = payeeService;
    }

    @GetMapping(value = "/{payeeId}", produces = APPLICATION_JSON_VALUE)
    public Payee payeeById(@PathVariable("payeeId") Integer payeeId) throws Exception {
        return payeeService.getById(payeeId);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Payee> getAllPayeesInfo() throws Exception {
        return payeeService.getAllInfo();
    }

}
