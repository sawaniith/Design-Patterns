package Behavioral.TemplateMethodPattern;

public class TemplateMain {
    public static void main(String[] args) {
        //when you want all classes to follow the specific steps to process the task but also,
        //need to provide the flexibility that each class can have their own logic in that specific steps.

        PaymentFlow upi = new UpiPayment();
        System.out.println("=== UPI Payment ===");
        upi.makePayment();

        System.out.println();

        PaymentFlow wallet = new WalletPayment();
        System.out.println("=== Wallet Payment ===");
        wallet.makePayment();
    }
}
