package Behavioral.CommandPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MyRemoteControl{

    //private Map<String, Command> buttons = new HashMap<>();  //If want to set multi Buttons Support

    private Command command;
    private Stack<Command> history = new Stack<>();

    public void setCommand(Command command) {
        this.command = command;
        //buttons.put("buttonName", command);
    }

    public void pressButton() {
        /*Command command = buttons.get("buttonName");
        if (command != null) {
            command.execute();
            history.push(command);
        } else {
            System.out.println("No command mapped to button: " + buttonName);
        }*/
        command.execute();
        history.push(command);
    }

    public void pressUndo() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo.");
        }
    }
}
