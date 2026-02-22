package chapter4.pizzaaf.ingredientfactory;

import chapter4.pizzaaf.cheese.Cheese;
import chapter4.pizzaaf.cheese.ReggianoCheese;
import chapter4.pizzaaf.clam.Clams;
import chapter4.pizzaaf.clam.FreshClams;
import chapter4.pizzaaf.dough.Dough;
import chapter4.pizzaaf.dough.ThinCrustDough;
import chapter4.pizzaaf.pepperoni.Pepperoni;
import chapter4.pizzaaf.pepperoni.SlicedPepperoni;
import chapter4.pizzaaf.sauce.MarinaraSauce;
import chapter4.pizzaaf.sauce.Sauce;
import chapter4.pizzaaf.veggie.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
