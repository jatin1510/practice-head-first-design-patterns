package chapter6;

import chapter6.commands.GarageDoorUpCommand;
import chapter6.commands.LightOnCommand;
import chapter6.objects.GarageDoor;
import chapter6.objects.Light;

public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Living Room");
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoorUpCommand garageDoorOpenCommand = new GarageDoorUpCommand(garageDoor);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();

        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
