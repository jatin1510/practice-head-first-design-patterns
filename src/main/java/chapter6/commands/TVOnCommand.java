package chapter6.commands;

import chapter6.Command;
import chapter6.objects.TV;

public class TVOnCommand implements Command {
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}
