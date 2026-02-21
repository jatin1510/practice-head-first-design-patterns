package solid.openclosed.gooddesign;

// 3. The Calculator: Closed for modification
class DiscountCalculator {
    public double calculate(DiscountStrategy strategy, double amount) {
        return strategy.apply(amount);
    }
}
