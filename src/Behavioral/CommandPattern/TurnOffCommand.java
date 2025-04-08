package Behavioral.CommandPattern;

public class TurnOffCommand implements Command{
    private AirConditioner ac;

    public TurnOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }

    @Override
    public void undo() {
        ac.turnOn();
    }
}
