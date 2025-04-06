package Structural.ProxyPattern;

import java.util.HashMap;
import java.util.Map;

public class PaymentServiceProxy implements PaymentService{
    private RealPaymentService realService = new RealPaymentService();
    private Map<String, Integer> requestCount = new HashMap<>();
    private static final int MAX_REQUESTS = 3;

    @Override
    public void makePayment(String user, double amount) {
        log(user, amount);

        int count = requestCount.getOrDefault(user, 0);
        if (count >= MAX_REQUESTS) {
            System.out.println("Rate limit exceeded for user: " + user);
            return;
        }

        requestCount.put(user, count + 1);
        realService.makePayment(user, amount);
    }

    private void log(String user, double amount) {
        System.out.println("[LOG] Payment attempt by " + user + " for ₹" + amount);
    }
}
