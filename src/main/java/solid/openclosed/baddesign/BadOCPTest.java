package solid.openclosed.baddesign;

// Test Drive for Bad Design
public class BadOCPTest {
    public static void main(String[] args) {
        DiscountCalculator calc = new DiscountCalculator();
        System.out.println("VIP Discount: " + calc.calculateDiscount("VIP", 1000));
    }
}
