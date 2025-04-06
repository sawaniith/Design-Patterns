package Behavioral.StrategyPattern;

public class EmailNotification implements NotificationStrategy{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}
