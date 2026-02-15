package chapter6.commands;

import chapter6.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("no command");
    }
}
