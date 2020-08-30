package com.sda.jpa.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "worker")
@Getter
@Setter
@NoArgsConstructor
@ToString
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
    private Department departmentId;

    public Worker(String firstName, String lastName, int age, LocalDateTime hireDate, Department departmentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hireDate = hireDate;
        this.departmentId = departmentId;
    }
}
