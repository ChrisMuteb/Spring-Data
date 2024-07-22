package com.lasuperbe.demo.models;

//import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(
            unique = true,
            nullable = false
    )
    private String identifier;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private LocalDate birthdate;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EmployeeRole role;

    @OneToOne
    @JoinColumn(name="address_id")
    private Address address;
}
