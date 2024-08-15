package main.PizzaStore.impl;

import main.Pizza.impl.ChicagoStyleCheesePizza;
import main.Pizza.Pizza;
import main.PizzaStore.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if(type.equalsIgnoreCase("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        else{
            return null;
        }
    }
}
