package Creational.AbstractFactoryPattern;

public class LuxuryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String brand){
        if (brand == null || brand.isEmpty()) return null;
        return switch (brand.toLowerCase()) {
            case "bmw" -> new Bmw();
            case "audi" -> new Audi();
            default -> throw new IllegalArgumentException("Unknown luxury brand: " + brand);
        };
    }
}
