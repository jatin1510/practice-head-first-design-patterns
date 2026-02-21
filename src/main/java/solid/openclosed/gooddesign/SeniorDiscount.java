package solid.openclosed.gooddesign;

// NEW: Adding a Senior discount is easy! No need to touch existing code.
class SeniorDiscount implements DiscountStrategy {
    public double apply(double amount) {
        return amount * 0.30;
    }
}
