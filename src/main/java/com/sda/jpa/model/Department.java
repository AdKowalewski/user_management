package com.sda.jpa.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

//@NamedQueries({
//        @NamedQuery(
//                name = "saveDepartment",
//                query = "INSERT INTO department d (d.name)" +
//                        "VALUES (d.name = :name,"),
//        @NamedQuery(
//                name = "deleteDepartment",
//                query = "DELETE FROM department d WHERE d.departmentId :=id"),
//        @NamedQuery(
//                name = "updateDepartment",
//                query = "UPDATE department d SET d.name = :name WHERE d.departmentId :=id"),
//})

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long departmentId;

    @Column(length = 100, nullable = false)
    private String name;

    public Department(String name) {
        this.name = name;
    }
}
