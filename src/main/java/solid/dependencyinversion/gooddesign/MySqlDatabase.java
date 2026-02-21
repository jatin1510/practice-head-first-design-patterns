package solid.dependencyinversion.gooddesign;

// 2. Low-level Concrete Implementations
public class MySqlDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("MySQL: Saving " + data);
    }
}
