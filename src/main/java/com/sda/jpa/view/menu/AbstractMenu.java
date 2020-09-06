package com.sda.jpa.view.menu;

import com.sda.jpa.utils.InputHelper;
import com.sda.jpa.view.IPage;

import java.util.List;

public abstract class AbstractMenu implements IPage {
    abstract List<MenuItem> getItems();

    @Override
    public void doAction() {
        while (true) {
            getItems().forEach((item) -> {
                System.out.println(item.getOption() + " - " + item.getText());
            });

            System.out.print("Your choince: ");
            int choince = InputHelper.getScanner().nextInt();
            InputHelper.getScanner().nextLine();
            // final int option = choince;
            MenuItem found = getItems().stream()
                    .filter((op) -> op.getOption() == choince)
                    .findFirst().orElse(null);

            if (found != null) {
                if (found.getOption() == 0 && found.getParent() == null) {
                    System.exit(0);
                } else if (found.getOption() == 0 && found.getParent() != null) {
                    found.getParent().doAction();
                } else {
                    found.getChild().doAction();
                }
            }
        }
    }
}
