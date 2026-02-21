package solid.openclosed.baddesign;

/*
* The Open/Closed Principle (OCP) is the "O" in SOLID.
* It states: "Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification."
* In plain English: You should be able to add new functionality to your system without changing the code you’ve already written and tested.
* */

/*
* 1. The "Bad Design": The Rigid Switch Statement
* In a bad design, adding a new feature requires you to open up an existing, working class and perform "surgery" on it.
* The Fallbacks:
* The "Jenga" Effect: Every time you add an if or switch case,
* you risk breaking the logic for existing categories (like VIPs) because you are editing the same file.
* Massive Classes: Over time, the class grows into a "Blob" that is hard to read.
* Violation of Testing: Since you modified the class, you must now re-test every single customer type, not just the new one.
* */

// VIOLATION: To add a 'Senior' discount, we MUST modify this class.
public class DiscountCalculator {
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("REGULAR")) {
            return amount * 0.05;
        } else if (customerType.equals("VIP")) {
            return amount * 0.20;
        } else if (customerType.equals("STUDENT")) {
            return amount * 0.15;
        }
        // To add "SENIOR", I have to come in here and add another 'else if'.
        // This is "Opening" the class for modification.
        return 0;
    }
}
