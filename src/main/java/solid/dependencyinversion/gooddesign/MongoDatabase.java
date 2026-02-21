package solid.dependencyinversion.gooddesign;

public class MongoDatabase implements Database {
    @Override
    public void save(String data) {
        System.out.println("MongoDB: Persisting " + data + " in a document.");
    }
}
