package solid.liskovsubstitution.gooddesign;

// 4. A Bird that cannot fly
public class Ostrich extends Bird {
    @Override
    public void eat() {
        System.out.println("Ostrich is eating grass.");
    }

    // No fly() method here, so no chance of breaking the contract!
}
