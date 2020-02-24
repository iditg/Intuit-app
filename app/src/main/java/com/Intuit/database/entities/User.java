package com.Intuit.database.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(schema = "intuit", name = "user")
@Getter
@Setter
public class User extends  AbstractEntity{
    @Column(name = "address")
    private String address;

    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String lname;

    @Column(name = "guid")
    private String guid;

    public User() {
    }
}
