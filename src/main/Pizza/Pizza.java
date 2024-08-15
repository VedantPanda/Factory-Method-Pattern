package main.Pizza;

public abstract class Pizza {
    protected String dough, name, sauce;

    public void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing Dough "+dough);
        System.out.println("Adding Sauce "+sauce);
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal pieces");
    }

    public void box(){
        System.out.println("Place pizza in official store box");
    }

}
