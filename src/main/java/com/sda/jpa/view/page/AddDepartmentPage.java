package com.sda.jpa.view.page;

import com.sda.jpa.dao.DaoFactory;
import com.sda.jpa.dao.DepartmentDao;
import com.sda.jpa.model.Department;
import com.sda.jpa.utils.InputHelper;
import com.sda.jpa.view.IPage;

public class AddDepartmentPage implements IPage {

    @Override
    public void doAction() {
        System.out.print("Department name: ");
        String departmentName = InputHelper.getScanner().nextLine();
        Department department = new Department(departmentName);
        DepartmentDao departmentDao = (DepartmentDao) DaoFactory.getInstance(DepartmentDao.class);
        departmentDao.save(department);
        System.out.println("New department successfully added!");
    }
}
