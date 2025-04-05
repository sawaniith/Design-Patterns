package Creational.FactoryDesignPattern;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type == null || type.isEmpty()) return null;
        return switch (type.toLowerCase()) {
            case "sms" -> new SmsNotification();
            case "email" -> new EmailNotification();
            default -> throw new IllegalArgumentException("Unknown notification type: " + type);
        };
    }
}

