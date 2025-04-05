package Creational.AbstractFactoryPattern;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        VehicleFactory factory = Factory.getFactory("ordinary");
        Vehicle vehicle = factory.getVehicle("maruti");
        vehicle.showFeatures();
    }
}
