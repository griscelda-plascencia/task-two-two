package org.example;

import java.util.List;

public class Hawaiian extends Pizza{
    private final List<String> toppings = List.of("pineapple","ham", "bacon");

    public Hawaiian(String size, String base) {
        super(size, base);
    }

    @Override
    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public String getPizzaType() {
        return "Hawaiian";
    }
}
