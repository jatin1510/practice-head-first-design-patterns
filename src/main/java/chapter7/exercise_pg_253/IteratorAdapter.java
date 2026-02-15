package chapter7.exercise_pg_253;

public class IteratorAdapter implements Enumeration {
    private final Iterator iterator;

    public IteratorAdapter(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}

