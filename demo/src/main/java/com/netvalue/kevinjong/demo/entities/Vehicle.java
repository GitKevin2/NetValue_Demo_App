package com.netvalue.kevinjong.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {
    @Id private String regPlate;
    private String name;

    public Vehicle() { }

    public Vehicle(String regPlate, String name) {
        this.regPlate = regPlate;
        this.name = name;
    }
}
