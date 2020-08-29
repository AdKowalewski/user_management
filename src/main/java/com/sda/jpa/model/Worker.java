package com.sda.jpa.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private long departmentId;
}
