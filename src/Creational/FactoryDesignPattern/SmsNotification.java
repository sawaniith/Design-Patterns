package Creational.FactoryDesignPattern;

public class SmsNotification implements Notification{
    @Override
    public void notifyUser(){
        System.out.println("Sending a SMS notification");
    }
}
