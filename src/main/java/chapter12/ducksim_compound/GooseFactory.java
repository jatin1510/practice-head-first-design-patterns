package chapter12.ducksim_compound;

public class GooseFactory implements AbstractGooseFactory {
    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}
