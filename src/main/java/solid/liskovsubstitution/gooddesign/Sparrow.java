package solid.liskovsubstitution.gooddesign;

// 3. A Bird that can fly
public class Sparrow extends Bird implements Flyable {
    @Override
    public void eat() {
        System.out.println("Sparrow is eating seeds.");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying high.");
    }
}
