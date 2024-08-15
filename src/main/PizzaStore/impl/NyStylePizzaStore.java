package main.PizzaStore.impl;

import main.Pizza.impl.NYStyleCheesePizza;
import main.Pizza.Pizza;
import main.PizzaStore.PizzaStore;

public class NyStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equalsIgnoreCase("cheese")){
            return new NYStyleCheesePizza();
        }
        else{
            return null;
        }
    }
}
