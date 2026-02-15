package chapter6.objects;

public class Light {
    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is on");
    }

    public void off() {
        System.out.println(location + " light is off");
    }

    public void dim() {
        System.out.println(location + " light is dimmed");
    }
}
