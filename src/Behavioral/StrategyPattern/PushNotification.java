package Behavioral.StrategyPattern;

public class PushNotification implements NotificationStrategy{
    public void sendNotification(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}
