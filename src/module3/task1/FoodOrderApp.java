package module3.task1;

/*
 * Simple Food Order Receipt Application
 * Task 1 - Demonstration of attributes, methods, and live templates
 * Author: [Your Name]
 */

import java.util.Scanner;

public class FoodOrderApp {

    //Attributes
    String foodName;
    int quantity;
    double pricePerItem;
    double totalPrice;

    public FoodOrderApp(String foodName, int quantity, double pricePerItem) {
        this.foodName = foodName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
        this.totalPrice = calculateTotal(); // Using method to calculate total
    }

    public double calculateTotal() {
        // Live Template example: calc -> total = pricePerItem * quantity;
       double total = pricePerItem * quantity;
       System.out.println("Total: ");
       return total;
    }


    public void printReceipt() {
        System.out.println("----- RECEIPT -----"); // sout
        System.out.println("Item: " + foodName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Item: $" + pricePerItem);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("-------------------");
    }

    //Main Method (psvm)
    public static void main(String[] args) { // psvm
        Scanner input = new Scanner(System.in);

        System.out.println("Enter food name: "); // sout
        String name = input.nextLine();

        System.out.println("Enter quantity: ");
        int qty = input.nextInt();

        System.out.println("Enter price per item: ");
        double price = input.nextDouble();

        // Create object
        FoodOrderApp order = new FoodOrderApp(name, qty, price);

        // Print receipt
        order.printReceipt();

        input.close();
    }
}

