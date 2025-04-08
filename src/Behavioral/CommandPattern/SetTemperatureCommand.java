package Behavioral.CommandPattern;

public class SetTemperatureCommand implements Command{
    private AirConditioner ac;
    private int newTemp;
    private int prevTemp;

    public SetTemperatureCommand(AirConditioner ac, int newTemp) {
        this.ac = ac;
        this.newTemp = newTemp;
    }

    @Override
    public void execute() {
        prevTemp = ac.getTemperature();  // Assume getter exists
        ac.setTemperature(newTemp);
    }

    @Override
    public void undo() {
        ac.setTemperature(prevTemp);
    }
}
