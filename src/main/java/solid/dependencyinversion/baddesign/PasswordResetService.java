package solid.dependencyinversion.baddesign;

// High-level module (the "What")
public class PasswordResetService {
    // VIOLATION: Directly depending on a specific implementation (Concretion)
    private final MySqlDatabase database = new MySqlDatabase();

    public void resetPassword(String email) {
        // Business logic...
        System.out.println("Processing password reset for: " + email);
        database.saveEmail(email);
    }
}
