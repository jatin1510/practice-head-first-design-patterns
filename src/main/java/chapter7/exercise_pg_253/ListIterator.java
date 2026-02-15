package chapter7.exercise_pg_253;

import java.util.List;

public class ListIterator implements Iterator {
    private final List<?> list;
    private int index = 0;

    public ListIterator(List<?> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Object next() {
        return list.get(index++);
    }

    @Override
    public void remove() {
        if (index <= 0) {
            throw new IllegalStateException("No element to remove");
        }
        list.remove(--index);
    }
}
