package solid.openclosed.gooddesign;

class StudentDiscount implements DiscountStrategy {
    public double apply(double amount) {
        return amount * 0.15;
    }
}
