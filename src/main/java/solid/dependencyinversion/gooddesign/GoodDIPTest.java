package solid.dependencyinversion.gooddesign;

/*
* 2. What 'DIP' Solves
*
* DIP solves Inflexibility. By introducing an interface, we "invert" the dependency.
* Instead of the high-level service looking down at the database, both look "up" at a shared interface.
*
* This allows you to swap databases, file systems, or even use "Mock" databases
* for unit testing without changing a single line of your PasswordResetService code.
* */

/*
* 3. The "Good Design": Dependency Injection
* We refactor by creating a Database interface and "injecting" the implementation via the constructor.
* */

public class GoodDIPTest {
    public static void main(String[] args) {
        // Scenario A: Production with MySQL
        Database mySql = new MySqlDatabase();
        PasswordResetService prodService = new PasswordResetService(mySql);
        prodService.resetPassword("admin@company.com");

        System.out.println("--- Swapping Database ---");

        // Scenario B: Testing or switching to MongoDB
        // Notice we don't change the PasswordResetService class at all!
        Database mongo = new MongoDatabase();
        PasswordResetService newService = new PasswordResetService(mongo);
        newService.resetPassword("dev@startup.io");
    }
}

/*
* Why this is better:
*
* Pluggability: You can add a MockDatabase for testing or a CloudDatabase for scaling without touching the business logic.
*
* Parallel Development: One developer can work on the PasswordResetService logic
* while another builds the MongoDatabase implementation.
*
* Reduced Risk: Changes in the database driver won't break the high-level flow of the application.
* */
