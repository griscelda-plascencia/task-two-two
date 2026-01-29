package org.example;

import java.util.List;
import java.util.ArrayList;
abstract class Pizza {
    private String size;
    private String base;
    private List<String> toppings;

    public Pizza(String size, String base) {
        this.size = size;
        this.base = base;
        this.toppings = new ArrayList<>();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public abstract String getPizzaType();
}