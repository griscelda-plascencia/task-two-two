package org.example;

import java.util.List;

public class Mexican extends Pizza{
    private final List<String> toppings = List.of("chorizo","chili", "onion", "meat");

    public Mexican(String size, String base) {
        super(size, base);
    }

    @Override
    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public String getPizzaType() {
        return "Mexican";
    }
}
