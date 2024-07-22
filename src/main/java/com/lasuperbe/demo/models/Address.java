package com.lasuperbe.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
//@Table(name="employee")
public class Address {
    @Id
    @GeneratedValue
    private Integer id;
    private String streetName;
    private String houseNumber;
    private String zipCode;
}
