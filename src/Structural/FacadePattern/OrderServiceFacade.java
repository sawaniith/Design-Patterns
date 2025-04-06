package Structural.FacadePattern;

public class OrderServiceFacade {
    private InventoryService inventory = new InventoryService();
    private PaymentService payment = new PaymentService();
    private InvoiceService invoice = new InvoiceService();
    private NotificationService notification = new NotificationService();

    public void placeOrder(String user, String item, double amount) {
        System.out.println("Placing order for " + user + "...");

        if (!inventory.checkStock(item)) {
            System.out.println("Item out of stock.");
            return;
        }

        if (!payment.processPayment(user, amount)) {
            System.out.println("Payment failed.");
            return;
        }

        invoice.generateInvoice(item, amount);
        notification.sendConfirmation(user);

        System.out.println("Order placed successfully for " + user);
    }
}