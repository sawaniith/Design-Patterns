package Structural.FacadePattern;

public class InventoryService {
    public boolean checkStock(String item) {
        System.out.println("Checking stock for: " + item);
        return true; // assume item is always in stock
    }
}
