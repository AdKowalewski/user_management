package com.sda.jpa.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

//@NamedQueries({
//        @NamedQuery(
//                name = "saveWorker",
//                query = "INSERT INTO worker w (w.firstName, w.lastName, w.age, w.hireDate, w.departmentId)" +
//                        "VALUES (w.firstName = :fName," +
//                        "w.lastName = :lName," +
//                        "w.age = :age," +
//                        "w.hireDate = :hDate," +
//                        "w.departmentId = :depId)"),
//        @NamedQuery(
//                name = "deleteWorker",
//                query = "DELETE FROM worker w WHERE w.workerId = :id"),
//        @NamedQuery(
//                name = "updateWorker",
//                query = "UPDATE worker w " +
//                        "SET w.firstName = :fName, " +
//                        "w.lastName = :lName, " +
//                        "w.age = :age, " +
//                        "w.hireDate = :hDate," +
//                        "w.departmentId = :depId " +
//                        "WHERE w.workerId = :id"),
//})

@Entity
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
