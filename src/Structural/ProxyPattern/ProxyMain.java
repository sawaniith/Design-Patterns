package Structural.ProxyPattern;

public class ProxyMain {
    public static void main(String[] args) {
        //used in caching, logging, rate limiting
        //used in access control (Control access to the real object)
        //pre and post activity logging, post activity event publishing

        PaymentService paymentService = new PaymentServiceProxy();

        paymentService.makePayment("sawan", 100);
        paymentService.makePayment("sawan", 200);
        paymentService.makePayment("sawan", 300);
        paymentService.makePayment("sawan", 400); // Will be rate-limited

        paymentService.makePayment("john", 500); // New user - allowed

        //proxy vs facade
        //proxy only takes care of a particular object. Each object will have their own proxy.
        //facade can take care of multiple objects together
    }
}
