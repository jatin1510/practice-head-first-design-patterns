package solid.dependencyinversion.baddesign;

/*
* the Dependency Inversion Principle (DIP) is the final "D" in SOLID. It states:
* High-level modules should not depend on low-level modules. Both should depend on abstractions.
* Abstractions should not depend on details. Details should depend on abstractions.
* In simpler terms: Stop hardcoding "how" things are done. Instead, depend on a "contract" (interface) that defines what should be done.
* */

/*
* 1. The "Bad Design": Hardcoded Dependencies
* In a bad design, a high-level service (like business logic) is "married" to
* a specific low-level tool (like a specific database). This is called Tight Coupling.
*
* The Fallbacks:
*
* The Swap Nightmare: If your company decides to move from MySQL to MongoDB,
* you have to rewrite your high-level business logic because it's full of new MySqlDatabase() calls.
*
* Impossible to Test: You can't test the PasswordResetService without having a real MySQL server running.
* You can't easily "mock" the database to simulate an error.
*
* Bottom-Up Rigidity: A change in a tiny low-level utility forces a recompilation of your entire high-level application.
* */

public class BadDIPTest {
    public static void main(String[] args) {
        PasswordResetService service = new PasswordResetService();
        service.resetPassword("user@example.com");
    }
}
