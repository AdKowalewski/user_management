package com.sda.jpa.model;

import java.time.LocalDateTime;

public class WorkerBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private LocalDateTime hireDate;
    private Department departmentId;

    public WorkerBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public WorkerBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public WorkerBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public WorkerBuilder setHireDate(LocalDateTime hireDate) {
        this.hireDate = hireDate;
        return this;
    }

    public WorkerBuilder setDepartment(Department department) {
        this.departmentId = department;
        return this;
    }

    public Worker createWorker() {
        return new Worker(firstName, lastName, age, hireDate, departmentId);
    }
}