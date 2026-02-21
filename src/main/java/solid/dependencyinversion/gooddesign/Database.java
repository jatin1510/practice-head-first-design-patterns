package solid.dependencyinversion.gooddesign;

// 1. The Abstraction (The Contract)
public interface Database {
    void save(String data);
}