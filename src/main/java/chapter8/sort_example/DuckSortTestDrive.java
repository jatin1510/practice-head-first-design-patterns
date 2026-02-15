package chapter8.sort_example;

import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Donald", 2),
                new Duck("Huey", 7),
                new Duck("Louie", 1),
                new Duck("Scrooge", 5)
        };

        System.out.println("Before sorting:");
        for (Duck duck : ducks) {
            System.out.println(duck);
        }

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting:");
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
