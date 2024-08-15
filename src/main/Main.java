package main;

import main.PizzaStore.impl.ChicagoStylePizzaStore;
import main.PizzaStore.impl.NyStylePizzaStore;
import main.PizzaStore.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NyStylePizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore = new ChicagoStylePizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
