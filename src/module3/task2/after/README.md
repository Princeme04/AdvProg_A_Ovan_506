# Task 1 - Simple Food Order Receipt Application

This project was created as part of **Advanced Programming – Module 3 (Modern Programming Environment and Documentation Style)**.  
It demonstrates the use of an Integrated Development Environment (IDE) with autocomplete features, a custom live template, and good programming structure in Java.

---

## Project Description

The **Simple Food Order Receipt Application** is a console-based Java program that simulates a restaurant’s order receipt system.  
The program allows users to input food details, quantity, and price per item, then calculates and displays the total amount in a formatted receipt.

This project aims to apply:
- The **autocomplete feature** in IntelliJ IDEA (e.g., `psvm`, `sout`, etc.)
- A **custom live template** for faster code generation
- The use of **attributes** and **methods** within an object-oriented approach

---

## Features

- Input for food name, quantity, and price per item  
- Automatic total price calculation  
- Formatted order receipt output  
- Implementation of class attributes, constructor, and methods  
- Demonstration of IntelliJ IDEA features such as autocomplete and live template  

---

## Source Code

```java
public class FoodOrderApp {
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

    // Method to print the receipt
    public void printReceipt() {
        System.out.println("=== Restaurant Order Receipt ===");
        System.out.println("Food Name   : " + foodName);
        System.out.println("Quantity    : " + quantity);
        System.out.println("Price/Item  : $" + pricePerItem);
        System.out.println("-------------------------------");
        System.out.println("Total Price : $" + calculateTotal());
        System.out.println("===============================");
    }

    // Main method
    public static void main(String[] args) {
        FoodOrderApp order = new FoodOrderApp("Nasi Goreng", 2, 3.50);
        order.printReceipt();
    }
}
-
