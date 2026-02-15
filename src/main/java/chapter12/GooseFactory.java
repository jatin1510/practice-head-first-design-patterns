package chapter12;

public class GooseFactory implements AbstractGooseFactory {
    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}
