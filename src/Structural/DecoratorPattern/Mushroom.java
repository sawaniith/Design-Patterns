package Structural.DecoratorPattern;

public class Mushroom extends ToppingDecorator{
    public Mushroom(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Mushroom";
    }

    public double getCost() {
        return pizza.getCost() + 30.0;
    }
}
