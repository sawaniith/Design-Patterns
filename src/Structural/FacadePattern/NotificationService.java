package Structural.FacadePattern;

public class NotificationService {
    public void sendConfirmation(String user) {
        System.out.println("Sending order confirmation to " + user);
    }
}
