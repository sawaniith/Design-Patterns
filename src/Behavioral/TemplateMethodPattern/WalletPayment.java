package Behavioral.TemplateMethodPattern;

public class WalletPayment extends PaymentFlow{
    @Override
    protected void authenticateUser() {
        System.out.println("Authenticating using OTP...");
    }

    @Override
    protected void checkBalance() {
        System.out.println("Checking wallet balance...");
    }

    @Override
    protected void processPayment() {
        System.out.println("Processing payment using wallet balance...");
    }

    // No post hook override — uses default
}
