package com.example.onetoone.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String model;

    @OneToOne(mappedBy = "car")
    private Onwer onwer;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\''+
                '}';
    }

    public Car() {

    }

    public Car(String model) {
        this.model = model;
    }
}
