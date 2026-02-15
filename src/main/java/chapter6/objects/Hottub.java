package chapter6.objects;

public class Hottub {
    public Hottub() {
    }

    public void on() {
        System.out.println("Hottub is on");
    }

    public void off() {
        System.out.println("Hottub is off");
    }

    public void circulate() {
        System.out.println("Hottub is circulating");
    }

    public void jetsOn() {
        System.out.println("Hottub jets are on");
    }

    public void jetsOff() {
        System.out.println("Hottub jets are off");
    }

    public void setTemperature(int temperature) {
        System.out.println("Hottub temperature is set to " + temperature);
    }
}
