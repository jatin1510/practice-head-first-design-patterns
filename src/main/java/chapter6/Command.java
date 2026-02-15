package chapter6;

public interface Command {
    void execute();
    default void undo() {
        System.out.println("undo not implemented");
    }
}
