package Creational.AbstractFactoryPattern;

public class Factory {
    public static VehicleFactory getFactory(String type) {
        if (type == null || type.isEmpty()) return null;
        return switch (type.toLowerCase()) {
            case "luxury" -> new LuxuryVehicleFactory();
            case "ordinary" -> new OrdinaryVehicleFactory();
            default -> throw new IllegalArgumentException("Unknown factory type: " + type);
        };
    }
}
