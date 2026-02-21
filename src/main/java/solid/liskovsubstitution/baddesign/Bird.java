package solid.liskovsubstitution.baddesign;

// Parent class makes a promise: All birds can fly.
class Bird {
    public void fly() {
        System.out.println("Flapping wings and flying...");
    }
}
