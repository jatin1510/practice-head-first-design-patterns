package solid.openclosed.gooddesign;

// 2. Concrete Implementations: We can add as many as we want!
class RegularDiscount implements DiscountStrategy {
    public double apply(double amount) {
        return amount * 0.05;
    }
}
