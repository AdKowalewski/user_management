package com.sda.jpa.view.page;

import com.sda.jpa.dao.DaoFactory;
import com.sda.jpa.dao.DepartmentDao;
import com.sda.jpa.model.Department;
import com.sda.jpa.view.IPage;

public class PrintAllDepartmentsPage implements IPage {

    @Override
    public void doAction() {
        DepartmentDao departmentDao = (DepartmentDao) DaoFactory.getInstance(DepartmentDao.class);
        departmentDao.getAll().forEach(System.out::println);
    }
}
