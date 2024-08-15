package main.Pizza.impl;

import main.Pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra thick crust dough";
        sauce = "Plum tomato sauce";
    }

    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
