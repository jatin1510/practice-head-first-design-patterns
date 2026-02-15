package chapter7.exercise_pg_253;

import java.util.ArrayList;
import java.util.List;

public class IteratorAdapterTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator iterator = new ListIterator(list);
        IteratorAdapter enumeration = new IteratorAdapter(iterator);

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
