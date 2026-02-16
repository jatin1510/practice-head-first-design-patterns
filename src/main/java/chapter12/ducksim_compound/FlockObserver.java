package chapter12.ducksim_compound;

public class FlockObserver implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("FlockObserver: " + duck + " just quacked.");
    }
}
