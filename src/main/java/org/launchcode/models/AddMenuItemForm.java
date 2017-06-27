package org.launchcode.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

/**
 * Created by MBZ on 2017/6/26.
 */
public class AddMenuItemForm {

    private Menu menu;
    private Iterable<Cheese> cheeses;

    @NotNull
    private int menuId;

    @NotNull
    private int cheeseId;

    public AddMenuItemForm() {}

    public AddMenuItemForm(Menu menu, Iterable<Cheese> cheeses) {
        this.menu = menu;
        this.cheeses = cheeses;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }

    public int getMenuId() {

        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public Iterable<Cheese> getCheeses() {

        return cheeses;
    }

    public void setCheeses(Iterable<Cheese> cheeses) {
        this.cheeses = cheeses;
    }

    public Menu getMenu() {

        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
