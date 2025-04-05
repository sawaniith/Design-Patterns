package Creational.AbstractFactoryPattern;

public class OrdinaryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String brand){
        if (brand == null || brand.isEmpty()) return null;
        return switch (brand.toLowerCase()) {
            case "tata" -> new Tata();
            case "maruti" -> new Maruti();
            default -> throw new IllegalArgumentException("Unknown ordinary brand: " + brand);
        };
    }
}
