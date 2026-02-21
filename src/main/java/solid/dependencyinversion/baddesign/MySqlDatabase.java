package solid.dependencyinversion.baddesign;

// Low-level module (the "How")
public class MySqlDatabase {
    public void saveEmail(String email) {
        System.out.println("Saving " + email + " to MySQL Database...");
    }
}
