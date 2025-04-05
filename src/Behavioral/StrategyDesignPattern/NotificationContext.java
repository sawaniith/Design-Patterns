package StrategyDesignPattern;

public class NotificationContext {
    NotificationStrategy strategy;
    NotificationContext(NotificationStrategy strategy){
        this.strategy = strategy;
    }

    void send(){
        strategy.sendNotification();
    }
}
