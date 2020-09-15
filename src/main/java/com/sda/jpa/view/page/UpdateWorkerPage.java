package com.sda.jpa.view.page;

import com.sda.jpa.dao.DaoFactory;
import com.sda.jpa.dao.DepartmentDao;
import com.sda.jpa.dao.WorkerDao;
import com.sda.jpa.model.Department;
import com.sda.jpa.model.Worker;
import com.sda.jpa.model.WorkerBuilder;
import com.sda.jpa.utils.InputHelper;
import com.sda.jpa.view.IPage;

import java.time.LocalDateTime;

public class UpdateWorkerPage implements IPage {

    @Override
    public void doAction() {
        System.out.println("Worker id: ");
        long workerId = InputHelper.getScanner().nextLong();
        WorkerDao workerdao = (WorkerDao) DaoFactory.getInstance(WorkerDao.class);
        Worker worker = workerdao.get(workerId);
        System.out.println("Selected worker: " + worker);
        System.out.print("Worker first name: ");
        String firstName = InputHelper.getScanner().nextLine();
        System.out.print("Worker last name: ");
        String lastName = InputHelper.getScanner().nextLine();
        System.out.print("Worker age: ");
        int age = InputHelper.getScanner().nextInt();
        System.out.print("Worker hire date: ");
        String hireDateString = InputHelper.getScanner().nextLine();
        LocalDateTime hireDate = LocalDateTime.parse(hireDateString);
        System.out.print("Worker department: ");
        long departmentId = InputHelper.getScanner().nextLong();
        DepartmentDao departmentDao = (DepartmentDao) DaoFactory.getInstance(DepartmentDao.class);
        Department department = departmentDao.get(departmentId);

        worker = new WorkerBuilder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setAge(age)
                .setHireDate(hireDate)
                .setDepartment(department)
                .createWorker();
        workerdao.update(worker);
        System.out.println("New worker successfully updated!");
    }
}
