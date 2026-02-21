package solid.liskovsubstitution.baddesign;

// Ostrich is a Bird (Is-A), but it cannot fly!
class Ostrich extends Bird {
    @Override
    public void fly() {
        // This violates the behavior expected of a 'Bird'
        throw new UnsupportedOperationException("Ostriches cannot fly!");
    }
}
