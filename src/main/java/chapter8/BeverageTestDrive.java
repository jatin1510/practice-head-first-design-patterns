package chapter8;

import java.util.Arrays;

public class BeverageTestDrive {
    public static void main(String[] args) {
        CaffeineBeverageWithHook coffee = new CoffeeWithHook();
        CaffeineBeverageWithHook tea = new TeaWithHook();

        System.out.println("Making coffee...");
        coffee.prepareRecipe();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
    }
}
