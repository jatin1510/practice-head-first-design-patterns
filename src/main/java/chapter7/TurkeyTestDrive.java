package chapter7;

public class TurkeyTestDrive {
    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();

        Duck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("The Duck says...");
        duck.quack();
        duck.fly();

        System.out.println("\nThe Turkey says...");
        testTurkey(turkey);

        System.out.println("\nThe DuckAdapter says...");
        testTurkey(duckAdapter);
    }

    static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}
