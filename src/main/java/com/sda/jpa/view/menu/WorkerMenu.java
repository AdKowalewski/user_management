package com.sda.jpa.view.menu;

import com.sda.jpa.view.IPage;
import com.sda.jpa.view.page.AddWorkerPage;
import com.sda.jpa.view.page.DeleteWorkerPage;
import com.sda.jpa.view.page.PrintAllWorkersPage;
import com.sda.jpa.view.page.UpdateWorkerPage;

import java.util.Arrays;
import java.util.List;

public class WorkerMenu extends AbstractMenu {

    private final IPage mainMenu;

    public WorkerMenu(IPage mainMenu) {
        this.mainMenu = mainMenu;
    }

    @Override
    List<MenuItem> getItems() {
        return Arrays.asList(
                new MenuItem("Add", 1, mainMenu, new AddWorkerPage()),
                new MenuItem("Delete", 2, mainMenu, new DeleteWorkerPage()),
                new MenuItem("Update", 3, mainMenu, new UpdateWorkerPage()),
                new MenuItem("Print all workers", 4, mainMenu, new PrintAllWorkersPage()),
                new MenuItem("Back", 0, mainMenu, null)
        );
    }
}
