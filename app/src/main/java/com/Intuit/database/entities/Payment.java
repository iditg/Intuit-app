package com.Intuit.database.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(schema = "intuit", name = "payment")
@Getter
@Setter
public class Payment extends  AbstractEntity{
    @Column(name = "amount")
    private double amount;
    @Column(name = "currency_id")
    private Integer currencyId;
    @Column(name = "user_guid")
    private String userGuid;
    @Column(name = "payee_guid")
    private String payeeGuid;
    @Column(name = "payment_method_guid")
    private String paymentMethodGuid;
    @Column(name = "status")
    private String status;

    public Payment() {
    }
}
