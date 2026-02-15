package chapter6;

public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void undo() {
        System.out.println("undoing macro command");
        for (int i = commands.length - 1; i >= 0; i--) {
            System.out.print("undoing command " + (i + 1) + " of " + commands[i].getClass().getName() + ": ");
            commands[i].undo();
        }
    }
}
