package chapter6;

import chapter6.commands.*;
import chapter6.objects.*;

public class RemoteControlMacro {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light light = new Light("living room");
        TV tv = new TV("living room");
        Stereo stereo = new Stereo("living room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);
        HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOnCommand, tvOnCommand, stereoOnCommand, hottubOnCommand};
        Command[] partyOff = {lightOffCommand, tvOffCommand, stereoOffCommand, hottubOffCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);

        remoteControl.undoButtonWasPushed();
    }
}
