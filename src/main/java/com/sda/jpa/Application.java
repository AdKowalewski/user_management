package com.sda.jpa;

import com.sda.jpa.dao.DepartmentDao;
import com.sda.jpa.model.Department;
import com.sda.jpa.utils.JPAUtil;

public class Application {

    public static void main(String[] args) {

        //JPAUtil.getEntityManager(); - not necessary

        DepartmentDao departmentDao = new DepartmentDao();
        Department sawedDepartment = departmentDao.save(new Department("Department name 1"));
        System.out.println("Sawed department: " + sawedDepartment);

        System.out.println(departmentDao.get(sawedDepartment.getDepartmentId()));
    }
}
