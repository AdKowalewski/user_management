package com.sda.jpa.view.menu;

import com.sda.jpa.view.IPage;

public class MenuItem {
    private final String text; //immutable

    private final int option;

    //private final Consumer<Object> action;

    private final IPage parent;

    private final IPage child;

    // TODO: menu function

    public MenuItem(final String text, final int option, /*final Consumer<Object> action,*/ final IPage parent, final IPage child) {
        this.text = text;
        this.option = option;
        //this.action = action;
        this.parent = parent;
        this.child = child;
    }

    public String getText() {
        return text;
    }

    public int getOption() {
        return option;
    }

    public IPage getParent() {
        return parent;
    }

    public IPage getChild() {
        return child;
    }
}
