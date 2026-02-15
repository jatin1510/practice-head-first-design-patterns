package chapter12;

public class FlockObserver implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("FlockObserver: " + duck + " just quacked.");
    }
}
