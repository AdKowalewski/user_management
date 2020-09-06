package com.sda.jpa;

import com.sda.jpa.view.menu.MainMenu;

public class Application {

    public static void main(String[] args) {

//        DepartmentDao departmentDao = new DepartmentDao();
//        Department sawedDepartment = departmentDao.save(new Department("Department name 1"));
//        System.out.println("Sawed department: " + sawedDepartment);
//
//        System.out.println("Get by id: " + departmentDao.get(sawedDepartment.getDepartmentId()));
//        System.out.println("Get all: " + departmentDao.getAll());
//        System.out.println("Find by name: " + departmentDao.findByName("department na"));
//
////        long id = 1;
////        System.out.println("Removing entity with departmentId = " + id);
////        departmentDao.delete(id);
////        System.out.println("Find element by id = " + id + " : " + departmentDao.get(id));
//
//        Department department = new Department("New name");
//        department.setDepartmentId(3);
//        departmentDao.update(department);
//
//        Worker worker = new WorkerBuilder()
//                .setFirstName("Adam")
//                .setLastName("Kowalewski")
//                .setAge(23)
//                .createWorker();

//        Department department = new Department("new");
//        department.setDepartmentId(1L);
//        System.out.println("Added department: " + departmentDao.save(department));
//        Worker worker = new WorkerBuilder()
//                .setFirstName("Adam")
//                .setLastName("Kowalewski")
//                .setAge(23)
//                .setHireDate(LocalDateTime.now())
//                .setDepartment(department)
//                .createWorker();
//        WorkerDao workerDao = new WorkerDao();
//        System.out.println("Added worker: " + workerDao.save(worker));

//        departmentDao.delete(1L);

        MainMenu mainMenu = new MainMenu();
        mainMenu.doAction();
    }
}
