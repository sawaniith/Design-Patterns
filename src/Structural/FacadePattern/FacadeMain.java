package Structural.FacadePattern;

public class FacadeMain {
    //whenever we need to hide the system complexity from client
    //Simplify usage of a complex subsystem
    //The Facade Pattern provides a simplified interface to a larger body of complex code, such as a subsystem with multiple classes.

    //proxy vs facade
    //proxy only takes care of a particular object. Each object will have their own proxy.
    //facade can take care of multiple objects together

    public static void main(String[] args) {
        OrderServiceFacade orderService = new OrderServiceFacade();
        orderService.placeOrder("sawan", "MacBook Pro", 200000);
    }
}