package com.homework.backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
    @Id
    private String id;
    private String street;
    private String zip;
    private String city;

    public Address() {}
}
