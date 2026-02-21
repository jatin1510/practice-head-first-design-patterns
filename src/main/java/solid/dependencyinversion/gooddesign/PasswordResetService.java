package solid.dependencyinversion.gooddesign;

// 3. High-level module (Depends only on the interface)
public class PasswordResetService {
    private final Database database;

    // The database is "Injected" (Dependency Injection)
    public PasswordResetService(Database database) {
        this.database = database;
    }

    public void resetPassword(String email) {
        System.out.println("System: Starting reset for " + email);
        database.save(email);
    }
}
