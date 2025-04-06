package Behavioral.StrategyPattern;

public class EmailStrategy implements NotificationStrategy{
    @Override
    public void sendNotification() {
        System.out.println("sending notification through email");
    }
}
