package StrategyDesignPattern;

public class SmsStrategy implements NotificationStrategy {
    @Override
    public void sendNotification() {
        System.out.println("sending notification via sms");
    }
}
