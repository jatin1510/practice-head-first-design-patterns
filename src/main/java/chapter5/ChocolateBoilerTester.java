package chapter5;

public class ChocolateBoilerTester {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        // Test the singleton property
        ChocolateBoiler anotherBoiler = ChocolateBoiler.getInstance();
        if (boiler == anotherBoiler) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("Different instances exist, singleton pattern is broken.");
        }
    }
}
