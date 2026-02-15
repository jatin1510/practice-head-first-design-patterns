package chapter3;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI };

    protected Size size = Size.TALL;

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }
}
