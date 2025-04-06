package Structural.DecoratorPattern;

public class DecoratorMain {
    public static void main(String[] args) {
        //The Decorator Pattern allows you to dynamically add new behavior to an object without altering its
        // structure, by wrapping it with a decorator class that implements the same interface.

        //used to avoid class explosion if we have lot of permutations possible of a class like pizza.
        //Follows Open/Closed Principle

        // Order 1: Margherita + Cheese + Mushroom
        Pizza order1 = new MargheritaPizza();
        order1 = new Cheese(order1);
        order1 = new Mushroom(order1);
        System.out.println("Order 1: " + order1.getDescription());
        System.out.println("Cost: ₹" + order1.getCost());

        // Order 2: Veg Delight + Mushroom
        Pizza order2 = new VegDelightPizza();
        order2 = new Mushroom(order2);
        System.out.println("\nOrder 2: " + order2.getDescription());
        System.out.println("Cost: ₹" + order2.getCost());
    }
}
