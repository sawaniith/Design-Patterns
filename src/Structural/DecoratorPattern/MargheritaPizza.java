package Structural.DecoratorPattern;

public class MargheritaPizza implements Pizza{
    public String getDescription() {
        return "Margherita Pizza";
    }

    public double getCost() {
        return 200.0;
    }
}
