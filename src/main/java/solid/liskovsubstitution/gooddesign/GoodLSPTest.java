package solid.liskovsubstitution.gooddesign;

import java.util.List;

/*
* 2. What 'LSP' Solves
*
* LSP solves Model Inaccuracy.
* It forces you to realize that your hierarchy is too broad.
* Just because an Ostrich is biologically a bird doesn't mean it should inherit a fly() method in your software model.
*
* By following LSP, you ensure that any part of your system
* can use any subclass interchangeably without checking types or catching "Unsupported" exceptions.
*
* 3. The "Good Design": Interface Segregation
* We fix this by being more specific about what a class can do rather than just what it is.
* We split the behaviors into interfaces.
*
* Why this is better:
* Safety: You can no longer accidentally call .fly() on an Ostrich because the compiler won't let you.
* Predictability: Any class implementing Flyable is guaranteed to actually fly.
* No Exceptions: We removed the need for UnsupportedOperationException.
* */

public class GoodLSPTest {
    public static void main(String[] args) {
        // We only put 'Flyable' birds in a list that needs to fly
        List<Flyable> flyingBirds = List.of(new Sparrow());
        for (Flyable bird : flyingBirds) {
            bird.fly();
        }

        // We put all birds in a list for eating
        List<Bird> allBirds = List.of(new Sparrow(), new Ostrich());
        for (Bird bird : allBirds) {
            bird.eat();
        }

        System.out.println("System is stable because behaviors are correctly subtyped.");
    }
}
