package solid.openclosed.gooddesign;

class VipDiscount implements DiscountStrategy {
    public double apply(double amount) {
        return amount * 0.20;
    }
}
