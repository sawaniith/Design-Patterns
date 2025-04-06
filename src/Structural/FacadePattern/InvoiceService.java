package Structural.FacadePattern;

public class InvoiceService {
    public void generateInvoice(String item, double amount) {
        System.out.println("Generating invoice for " + item + " - ₹" + amount);
    }
}
