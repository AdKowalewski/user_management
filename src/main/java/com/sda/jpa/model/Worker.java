package com.sda.jpa.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long workerId;

    @Column(length = 50, nullable = false)
    private String firstName;

    @Column(length = 50, nullable = false)
    private String lastName;

    private int age;

    @Temporal(TemporalType.DATE)
    private LocalDate hireDate;

    @OneToMany()
    private long departmentId;
}
