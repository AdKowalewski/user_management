package com.sda.jpa.view.page;

import com.sda.jpa.dao.DaoFactory;
import com.sda.jpa.dao.DepartmentDao;
import com.sda.jpa.model.Department;
import com.sda.jpa.utils.InputHelper;
import com.sda.jpa.view.IPage;

public class DeleteDepartmentPage implements IPage {

    @Override
    public void doAction() {
        System.out.println("Department id: ");
        long departmentId = InputHelper.getScanner().nextLong();
        DepartmentDao departmentDao = (DepartmentDao) DaoFactory.getInstance(DepartmentDao.class);
        Department department = departmentDao.get(departmentId);
        System.out.println("Selected department: " + department);
        departmentDao.delete(departmentId);
    }
}
