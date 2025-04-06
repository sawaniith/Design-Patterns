package Behavioral.StrategyPattern;

public class StrategyMain {
    public static void main(String[] args) {
        //Strategy Pattern lets you define different behaviors (algorithms), put them in separate classes, and
        //switch between them at runtime without changing the code that uses them.

        NotificationService service = new NotificationService(new EmailNotification());
        service.notifyUser("Your order has been placed.");

        service.setStrategy(new SMSNotification());
        service.notifyUser("Your order has been shipped.");

        service.setStrategy(new PushNotification());
        service.notifyUser("Your order has been delivered.");
    }
}
