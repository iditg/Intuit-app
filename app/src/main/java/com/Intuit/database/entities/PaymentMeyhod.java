package com.Intuit.database.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(schema = "intuit", name = "payment_method")
@Getter
@Setter
public class PaymentMeyhod extends  AbstractEntity{
    @Column(name = "guid")
    private String guid;
    @Column(name = "description")
    private String description;

    public PaymentMeyhod() {
    }
}
