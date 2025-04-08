package Behavioral.CommandPattern;

public class CommandMain {
    public static void main(String[] args) {
        //This pattern decouples the object that issues the request (Invoker) from the object that knows how to
        //perform it (Receiver). Each command object implements a standard interface with an execute() method and
        //optionally undo(), allowing actions to be handled uniformly.

        //Problem without Command Pattern:
        //Lack of Abstraction : Today, process of turning on AC is simple, but if there are more steps, client has to aware all of
        //that, which is not good.

        //Undo/Redo Functionality:
        //What if I want to implement the undo/redo capability. How it will be handled.

        //Command Pattern Solves this using Invoker(Remote), Command and Receiver(AC, TV, etc) Logic.

        AirConditioner ac = new AirConditioner();

        Command turnOn = new TurnOnCommand(ac);
        Command setTemp = new SetTemperatureCommand(ac, 20);
        Command turnOff = new TurnOffCommand(ac);

        MyRemoteControl remote = new MyRemoteControl();

        remote.setCommand(turnOn);
        remote.pressButton();

        remote.setCommand(setTemp);
        remote.pressButton();

        remote.setCommand(turnOff);
        remote.pressButton();

        // Undo last 3 operations
        remote.pressUndo();  // Undo turnOff => turnOn
        remote.pressUndo();  // Undo setTemp => reset to previous temp
        remote.pressUndo();  // On => Off

        remote.pressUndo();  // Nothing to Undo
    }
}
