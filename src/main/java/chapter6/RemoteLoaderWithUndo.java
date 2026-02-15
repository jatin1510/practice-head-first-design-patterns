package chapter6;

import chapter6.commands.*;
import chapter6.objects.CeilingFan;
import chapter6.objects.Light;

public class RemoteLoaderWithUndo {
    public static void main(String[] args) {
        // Example1: Implementing undo functionality for a remote control with a light
//        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
//
//        Light livingRoomLight = new Light("Living Room");
//
//        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
//
//        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//
//        System.out.println(remoteControl);
//
//        remoteControl.undoButtonWasPushed();
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.onButtonWasPushed(0);
//
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();

        // Example2: Implementing undo functionality for a remote control with ceiling fan
        RemoteControlWithUndo remoteControl = getRemoteControlWithUndoForCeilingFan();

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);

        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }

    private static RemoteControlWithUndo getRemoteControlWithUndoForCeilingFan() {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
        return remoteControl;
    }
}
