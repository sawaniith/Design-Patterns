package Behavioral.CommandPattern;

public class TurnOnCommand implements Command{
    private AirConditioner ac;

    public TurnOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }

    @Override
    public void undo() {
        ac.turnOff();
    }
}
