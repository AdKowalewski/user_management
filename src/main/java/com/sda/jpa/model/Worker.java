package com.sda.jpa.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "worker")
@Getter
@Setter
@NoArgsConstructor
@ToString
//@Builder // - lombok
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long workerId;

    @Column(length = 50, nullable = false)
    private String firstName;

    @Column(length = 50, nullable = false)
    private String lastName;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private LocalDateTime hireDate;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Worker(String firstName, String lastName, int age, LocalDateTime hireDate, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hireDate = hireDate;
        this.department = department;
    }
}
