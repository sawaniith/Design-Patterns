package Structural.FacadePattern;

public class PaymentService {
    public boolean processPayment(String user, double amount) {
        System.out.println("Processing payment of ₹" + amount + " for " + user);
        return true;
    }
}
