package chapter5;

public class ChocolateBoilerEnumTester {
    public static void main(String[] args) {
        ChocolateBoilerEnum boiler = ChocolateBoilerEnum.INSTANCE;
        boiler.fill();
        boiler.boil();
        boiler.drain();

        // Test the singleton property
        ChocolateBoilerEnum anotherBoiler = ChocolateBoilerEnum.INSTANCE;
        if (boiler == anotherBoiler) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("Different instances exist, singleton pattern is broken.");
        }
    }
}
