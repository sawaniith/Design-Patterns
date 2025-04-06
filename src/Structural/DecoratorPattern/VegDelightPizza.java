package Structural.DecoratorPattern;

public class VegDelightPizza implements Pizza{
    public String getDescription() {
        return "Veg Delight Pizza";
    }

    public double getCost() {
        return 250.0;
    }
}
