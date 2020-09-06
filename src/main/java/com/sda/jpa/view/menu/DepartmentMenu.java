package com.sda.jpa.view.menu;

import com.sda.jpa.view.IPage;
import com.sda.jpa.view.page.*;

import java.util.Arrays;
import java.util.List;

public class DepartmentMenu extends AbstractMenu {

    private final IPage mainMenu;

    public DepartmentMenu(IPage mainMenu) {
        this.mainMenu = mainMenu;
    }

    @Override
    List<MenuItem> getItems() {
        return Arrays.asList(
                new MenuItem("Add", 1, mainMenu, new AddDepartmentPage()),
                new MenuItem("Delete", 2, mainMenu, new DeleteDepartmentPage()),
                new MenuItem("Update", 3, mainMenu, new UpdateDepartmentPage()),
                new MenuItem("Print workers of selected department", 4, mainMenu, new PrintDepartmentWorkersPage()),
                new MenuItem("Print all departments", 5, mainMenu, new PrintAllDepartmentsPage()),
                new MenuItem("Back", 0, mainMenu, null)
        );
    }
}
