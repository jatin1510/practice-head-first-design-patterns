package chapter12.ducksim_compound;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
