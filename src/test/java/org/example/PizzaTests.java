package org.example;

import org.junit.Test;
import org.junit.Assert;
public class PizzaTests {

    @Test
    public void shouldPrepareHawaiianPizza() {
        Pizza pizza = new Hawaiian("m","flour");

        Assert.assertTrue(pizza.getToppings().contains("pineapple"));
        Assert.assertEquals("Hawaiian", pizza.getPizzaType());
    }

     @Test
    public void shouldPrepareMexicanPizza() {
        Pizza pizza = new Mexican("s","flour");

        Assert.assertTrue(pizza.getToppings().contains("chili"));
        Assert.assertEquals("Mexican", pizza.getPizzaType());
    }
}