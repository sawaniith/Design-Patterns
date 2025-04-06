package Behavioral.StrategyPattern;

public class SDPMain {
    public static void main(String[] args) {
        NotificationContext obj = new NotificationContext(new SmsStrategy());
        obj.send();
    }
}
