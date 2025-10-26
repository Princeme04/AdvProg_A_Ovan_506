package module3.task1;

public class FoodOrderApp {
    // Attributes
    String foodName;
    int quantity;
    double pricePerItem;

    // Constructor
    public FoodOrderApp(String foodName, int quantity, double pricePerItem) {
        this.foodName = foodName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Method to calculate total price
    public double calculateTotal() {
        return quantity * pricePerItem;
    }

    // Method to print receipt
    public void printReceipt() {
        System.out.println("=== Restaurant Order Receipt ===");
        System.out.println("Food Name   : " + foodName);
        System.out.println("Quantity    : " + quantity);
        System.out.println("Price/Item  : $" + pricePerItem);
        System.out.println("-------------------------------");
        System.out.println("Total Price : $" + calculateTotal());
        System.out.println("===============================");
    }

    // Main method (entry point)
    public static void main(String[] args) {
        // Example order
        FoodOrderApp order1 = new FoodOrderApp("Nasi Goreng", 2, 3.50);
        order1.printReceipt();
    }
}

