package chapter8.sort_example;

public class Duck implements Comparable<Duck> {
    private final String name;
    private final int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    // This is the method that is part of template method pattern, it is used to compare two ducks based on their weight
    public int compareTo(Duck other) {
        return Integer.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return name + " weighs " + weight + " grams";
    }
}
