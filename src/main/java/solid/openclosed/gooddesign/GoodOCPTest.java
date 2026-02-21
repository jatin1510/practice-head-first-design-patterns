package solid.openclosed.gooddesign;

/*
* 2. What 'OCP' Solves
* OCP solves Regression. By using interfaces, the DiscountCalculator doesn't care how many customer types exist.
* It just knows they all follow a "rule" (the interface).
* If you want to add a "Senior" discount, you simply create a new class.
* The original DiscountCalculator remains untouched and "closed" to changes,
* meaning your existing VIP logic is 100% safe from accidental bugs.
*
* 3. The "Good Design": Abstraction & Extension
* We refactor by creating an interface for the discount logic. Now, DiscountCalculator depends on an abstraction.
* */

public class GoodOCPTest {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        // We can pass any strategy we want
        DiscountStrategy vip = new VipDiscount();
        DiscountStrategy senior = new SeniorDiscount();

        System.out.println("VIP Discount: " + calculator.calculate(vip, 1000));
        System.out.println("Senior Discount: " + calculator.calculate(senior, 1000));
    }
}

/*
* Why this is better:
* Zero Modification: To add a "Senior" discount, we created a new class.
* We didn't touch a single line of the VipDiscount or RegularDiscount code.
* Cleaner Code: No more giant switch statements.
* Independent Testing: You only need to write a unit test for the new SeniorDiscount class.
* You already know the other classes work.
* */