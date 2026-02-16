package chapter12.ducksim_compound;

public interface AbstractDuckFactory {
    Quackable createMallardDuck();
    Quackable createReadHeadDuck();
    Quackable createDuckCall();
    Quackable createRubberDuck();
}
