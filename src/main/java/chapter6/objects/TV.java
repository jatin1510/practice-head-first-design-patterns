package chapter6.objects;

public class TV {
    String location;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " TV is on");
    }

    public void off() {
        System.out.println(location + " TV is off");
    }

    public void setInputChannel() {
        System.out.println(location + " TV channel is set");
    }

    public void setVolume() {
        System.out.println(location + " TV volume is set");
    }
}
