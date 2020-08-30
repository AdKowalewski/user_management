package com.sda.jpa;

import com.sda.jpa.dao.DepartmentDao;
import com.sda.jpa.model.Department;

public class Application {

    public static void main(String[] args) {

        DepartmentDao departmentDao1 = new DepartmentDao();
        Department sawedDepartment1 = departmentDao1.save(new Department("Department name 1"));
        System.out.println("Sawed department: " + sawedDepartment1);

        System.out.println("Get by id: " + departmentDao1.get(sawedDepartment1.getDepartmentId()));
        System.out.println("Get all: " + departmentDao1.getAll());
    }
}
