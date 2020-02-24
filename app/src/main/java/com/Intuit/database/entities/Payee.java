package com.Intuit.database.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(schema = "intuit", name = "payee")
@Getter
@Setter
public class Payee extends  AbstractEntity{
    @Column(name = "guid")
    private String guid;

    @Column(name = "description")
    private String description;

    public Payee() {
    }
}
