package com.Intuit.database.entities;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewPaymentRequest {
    private double amount;
    private String currency;
    private String user_guid;
    private String payee_guid;
    private String paymentMethod_guid;
}
