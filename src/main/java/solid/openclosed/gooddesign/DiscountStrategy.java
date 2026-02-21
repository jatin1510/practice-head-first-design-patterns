package solid.openclosed.gooddesign;

// 1. The Interface: Open for extension
interface DiscountStrategy {
    double apply(double amount);
}
