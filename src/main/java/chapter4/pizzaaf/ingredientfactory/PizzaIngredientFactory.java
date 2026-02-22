package chapter4.pizzaaf.ingredientfactory;

import chapter4.pizzaaf.cheese.Cheese;
import chapter4.pizzaaf.clam.Clams;
import chapter4.pizzaaf.dough.Dough;
import chapter4.pizzaaf.pepperoni.Pepperoni;
import chapter4.pizzaaf.sauce.Sauce;
import chapter4.pizzaaf.veggie.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
