package com.Intuit.database.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema = "intuit", name = "currency")
@Getter
@Setter
public class Currency extends  AbstractEntity{
    @Column(name = "description")
    private String description;

    public Currency() {
    }
}