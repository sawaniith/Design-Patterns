package Behavioral.TemplateMethodPattern;

public class UpiPayment extends PaymentFlow{
    @Override
    protected void authenticateUser() {
        System.out.println("Authenticating using UPI PIN...");
    }

    @Override
    protected void checkBalance() {
        System.out.println("Checking bank account balance via UPI...");
    }

    @Override
    protected void processPayment() {
        System.out.println("Processing UPI transfer...");
    }

    @Override
    protected void postPaymentHook() {
        System.out.println("Sending cashback notification...");
    }
}
