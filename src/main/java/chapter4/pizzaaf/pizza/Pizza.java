package chapter4.pizzaaf.pizza;

import chapter4.pizzaaf.cheese.Cheese;
import chapter4.pizzaaf.clam.Clams;
import chapter4.pizzaaf.dough.Dough;
import chapter4.pizzaaf.pepperoni.Pepperoni;
import chapter4.pizzaaf.sauce.Sauce;
import chapter4.pizzaaf.veggie.Veggies;

public abstract class Pizza {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies[] veggies;
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(name).append(" ----\n");
        if (dough != null) {
            result.append("dough: ");
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append("sauce: ");
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append("cheese: ");
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            result.append("veggies: ");
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clam != null) {
            result.append("clam: ");
            result.append(clam);
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append("pepperoni: ");
            result.append(pepperoni);
            result.append("\n");
        }
        return result.toString();
    }
}
