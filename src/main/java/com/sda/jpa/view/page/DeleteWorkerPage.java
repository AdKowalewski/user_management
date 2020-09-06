package com.sda.jpa.view.page;

import com.sda.jpa.dao.DaoFactory;
import com.sda.jpa.dao.WorkerDao;
import com.sda.jpa.model.Department;
import com.sda.jpa.model.Worker;
import com.sda.jpa.utils.InputHelper;
import com.sda.jpa.view.IPage;

public class DeleteWorkerPage implements IPage {

    @Override
    public void doAction() {
        System.out.println("Worker id: ");
        long workerId = InputHelper.getScanner().nextLong();
        WorkerDao workerdao = (WorkerDao) DaoFactory.getInstance(WorkerDao.class);
        Worker worker = workerdao.get(workerId);
        System.out.println("Selected worker: " + worker);
        workerdao.delete(workerId);
    }
}
