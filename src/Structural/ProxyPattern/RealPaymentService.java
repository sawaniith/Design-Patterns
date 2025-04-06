package Structural.ProxyPattern;

public class RealPaymentService implements PaymentService{
    @Override
    public void makePayment(String user, double amount) {
        System.out.println("Processing payment of ₹" + amount + " for user " + user);
    }
}
