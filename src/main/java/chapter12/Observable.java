package chapter12;

import java.util.ArrayList;
import java.util.List;

public class Observable implements QuackObservable {
    private final QuackObservable duck;
    private final List<Observer> observers = new ArrayList<>();

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        if (observers.isEmpty()) {
            // No observers registered; nothing to do (avoid noisy logging).
            return;
        }
        System.out.println("Notifying observers... " + observers.size() + " observer(s) notified.");
        for (Observer observer : observers) {
            observer.update(duck);
        }
    }
}
