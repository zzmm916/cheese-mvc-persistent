package org.launchcode.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by MBZ on 2017/6/26.
 */
@Entity
public class Menu {
    @NotNull
    @Size(min=3,max=15)
    private String name;


    @Id
    @GeneratedValue
    private int id;

    @ManyToMany
    private List<Cheese> cheeses;

    public int getId() {
        return id;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cheese> getCheeses() {

        return cheeses;
    }

    public void addItem(Cheese item) {cheeses.add(item);}

    public Menu(){}

    public Menu(String name) {
        this.name = name;
    }
}
