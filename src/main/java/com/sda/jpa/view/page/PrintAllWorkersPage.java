package com.sda.jpa.view.page;

import com.sda.jpa.dao.DaoFactory;
import com.sda.jpa.dao.WorkerDao;
import com.sda.jpa.model.Worker;
import com.sda.jpa.view.IPage;

public class PrintAllWorkersPage implements IPage {

    @Override
    public void doAction() {
        WorkerDao workerDao = (WorkerDao) DaoFactory.getInstance(WorkerDao.class);
        workerDao.getAll().forEach(System.out::println);
    }
}
