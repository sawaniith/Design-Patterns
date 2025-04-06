package Behavioral.StrategyPattern;

public class NotificationService {
    NotificationStrategy strategy;
    public NotificationService(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void notifyUser(String message) {
        strategy.sendNotification(message);
    }
}
