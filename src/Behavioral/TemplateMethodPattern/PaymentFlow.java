package Behavioral.TemplateMethodPattern;

public abstract class PaymentFlow {

    // Template method: which define the order of steps to execute the task.
    protected final void makePayment() {   //final to avoid override
        validateUser();
        authenticateUser();
        checkBalance();
        processPayment();
        postPaymentHook(); // Optional step
    }

    // Default implementations
    protected void validateUser() {
        System.out.println("Basic user validation...");
    }

    // Abstract methods — different per payment type
    protected abstract void authenticateUser();
    protected abstract void checkBalance();
    protected abstract void processPayment();

    // Hook method — optional override
    protected void postPaymentHook() {
        System.out.println("No Post Payment Hooks...");
    }
}
