package Structural.DecoratorPattern;

public class Cheese extends ToppingDecorator{
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public double getCost() {
        return pizza.getCost() + 40.0;
    }
}
