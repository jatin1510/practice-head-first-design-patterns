package solid.singleresponsibility.baddesign;

/*
* The Single Responsibility Principle (SRP) is the first and perhaps most vital of the SOLID principles.
* It’s often summarized as: "A class should have one, and only one, reason to change."
* Think of it this way: if a class does three different things,
* there are three different groups of people (stakeholders) who might ask you to change that class.
* That’s a recipe for bugs.
* */

/*
* 1. The "Bad Design": The Swiss Army Knife Class
* In bad design, we often create "God Classes."
* These classes are heavily coupled—meaning different functionalities are tangled together like a ball of yarn.
* The Fallbacks:
*   Fragility: When you change the code to fix a database bug, you accidentally break the logic that sends emails.
*   Rigidity: It’s hard to change one part of the system without affecting everything else.
*   Testing Difficulty: To test a simple math calculation, you’re forced to mock a database and a mail server because they are all inside the same class.
*   Merge Conflicts: If two developers work on the same class for different reasons, merging their code becomes a nightmare.
❌ The "Bad" Code (Violation of SRP)
In this example, the Employee class calculates pay (Business Logic), saves data (Persistence), and prints a report (Presentation).
* */

// VIOLATION: This class has 3 reasons to change!
public class Employee {
    private final String name;
    private final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Reason 1: Change in Tax/Pay logic
    public double calculatePay() {
        return salary - (salary * 0.2); // Simplified tax
    }

    // Reason 2: Change in Database technology (e.g., switching to MongoDB)
    public void saveToDatabase() {
        System.out.println("Saving " + name + " to MySQL Database...");
    }

    // Reason 3: Change in Reporting format (e.g., switching to PDF or HTML)
    public void printPerformanceReport() {
        System.out.println("Printing report for " + name + ": Excellent performance.");
    }
}
