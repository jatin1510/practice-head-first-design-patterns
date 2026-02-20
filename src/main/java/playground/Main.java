package playground;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .age(10)
                .name("Vivan")
                .build();

        System.out.println(person);
    }
}
