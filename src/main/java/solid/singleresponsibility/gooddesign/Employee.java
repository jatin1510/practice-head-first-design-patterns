package solid.singleresponsibility.gooddesign;

/*
 * 2. What 'S' Solves
 * The SRP solves Complexity. By breaking the "God Class" into smaller, focused classes:
 * Maintenance is safer: You can swap the Database logic without ever touching the Salary logic.
 * Classes are smaller: They are easier to read and understand.
 * True Reusability: You can use the EmailService for Users, Products, and Employees without duplicating code.
 *
 * 3. The "Good Design": Focused Responsibilities
 * We refactor the code by identifying the different "actors" or "reasons to change"
 * and moving them into their own classes.
 * */

// 1. The Entity: Only handles Employee data and basic logic
class Employee {
    private final String name;
    private final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
