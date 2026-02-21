package solid.liskovsubstitution.baddesign;

import java.util.List;

/*
* The Liskov Substitution Principle (LSP) is the "L" in SOLID.
* It was introduced by Barbara Liskov and states:
* "Objects of a superclass should be replaceable with objects of its subclasses without breaking the application."
*
* In simpler terms: A subclass shouldn't just inherit the code of the parent;
* it must also honor the behavioral contract of the parent.
* If your code expects a Bird to fly,
* and you pass it an Ostrich that throws an error when asked to fly, you’ve broken LSP.
*
* 1. The "Bad Design": The Ostrich-Bird Paradox
* In many beginner tutorials, we are taught that inheritance represents an "Is-A" relationship.
* However, in software, a "Square Is-A Rectangle" or "Ostrich Is-A Bird" can lead to disasters
* because the subclass cannot fulfill the promises made by the superclass.
*
* The Fallbacks:
*   The "Unimplemented" Trap: You find yourself writing throw new UnsupportedOperationException() in a subclass.
*   Unexpected Crashes: Code that works perfectly with the parent class suddenly crashes when a specific subclass is introduced.
*   Type Checking Hacks: You start writing if (bird instanceof Ostrich) throughout your code to avoid calling certain methods. This violates both LSP and OCP.
* */

// Test Drive for Bad Design
public class BadLSPTest {
    public static void main(String[] args) {
        List<Bird> birds = List.of(new Bird(), new Ostrich());

        for (Bird bird : birds) {
            // The developer assumes every bird can fly.
            // When it reaches Ostrich, the whole system crashes.
            bird.fly();
        }
    }
}
