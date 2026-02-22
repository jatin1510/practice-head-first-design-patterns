package chapter4.pizzaaf.ingredientfactory;

import chapter4.pizzaaf.cheese.Cheese;
import chapter4.pizzaaf.cheese.MozzarellaCheese;
import chapter4.pizzaaf.clam.Clams;
import chapter4.pizzaaf.clam.FrozenClams;
import chapter4.pizzaaf.dough.Dough;
import chapter4.pizzaaf.dough.ThickCrustDough;
import chapter4.pizzaaf.pepperoni.Pepperoni;
import chapter4.pizzaaf.pepperoni.SlicedPepperoni;
import chapter4.pizzaaf.sauce.PlumTomatoSauce;
import chapter4.pizzaaf.sauce.Sauce;
import chapter4.pizzaaf.veggie.BlackOlives;
import chapter4.pizzaaf.veggie.Eggplant;
import chapter4.pizzaaf.veggie.Spinach;
import chapter4.pizzaaf.veggie.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new Spinach(), new Eggplant()};
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
