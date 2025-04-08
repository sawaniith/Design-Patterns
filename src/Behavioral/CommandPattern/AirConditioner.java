package Behavioral.CommandPattern;

public class AirConditioner {
    private int temperature = 25;

    public void turnOn() {
        System.out.println("AC is turned ON");
    }

    public void turnOff() {
        System.out.println("AC is turned OFF");
    }

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("AC temperature set to " + temp + "°C");
    }

    public int getTemperature() {
        return temperature;
    }
}
