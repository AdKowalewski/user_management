package com.sda.jpa;

import com.sda.jpa.dao.DepartmentDao;
import com.sda.jpa.model.Department;
import com.sda.jpa.model.Worker;
import com.sda.jpa.model.WorkerBuilder;

public class Application {

    public static void main(String[] args) {

        DepartmentDao departmentDao = new DepartmentDao();
        Department sawedDepartment = departmentDao.save(new Department("Department name 1"));
        System.out.println("Sawed department: " + sawedDepartment);

        System.out.println("Get by id: " + departmentDao.get(sawedDepartment.getDepartmentId()));
        System.out.println("Get all: " + departmentDao.getAll());
        System.out.println("Find by name: " + departmentDao.findByName("department na"));

//        long id = 1;
//        System.out.println("Removing entity with departmentId = " + id);
//        departmentDao.delete(id);
//        System.out.println("Find element by id = " + id + " : " + departmentDao.get(id));

        Department department = new Department("New name");
        department.setDepartmentId(3);
        departmentDao.update(department);

        Worker worker = new WorkerBuilder()
                .setFirstName("Adam")
                .setLastName("Kowalewski")
                .setAge(23)
                .createWorker();
    }
}
