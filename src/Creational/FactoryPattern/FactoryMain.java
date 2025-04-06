package Creational.FactoryPattern;

public class FactoryMain {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("emai");
        notification.notifyUser(); // Output: Sending an SMS notification
    }
}
