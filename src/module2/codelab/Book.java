package module2.codelab;

// Book class to store book details
public class Book {
    private String title;  //  Encapsulate Field: make private, add getter/setter
    private String author;
    private double price;
    private int stock;


    private static final double DISCOUNT_RATE = 0.1;//constant discountrate


    public String getTitle() {
        return title; }
    public void setTitle(String title) {
        this.title = title; }

    public String getAuthor() {
        return author; }
    public void setAuthor(String author) {
        this.author = author; }

    public int getStock() {
        return stock; }
    public void setStock(int stock) {
        this.stock = stock; }

    public double getPrice() {
        return price; }
    public void setPrice(double price) {
        this.price = price; }

    // Extracted method
    public double calculateDiscount() {
        return price - (price * DISCOUNT_RATE);
    }

    public void displayInfo() {
        System.out.println("Title: " + title);                     // 🔧 Use getter after encapsulation
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Price after discount: " + calculateDiscount()); // 🔧 Extract Method: move to calculateDiscount()
        System.out.println("Stock: " + stock);
    }

    public void adjustStock(int adjustment) {
        stock += adjustment; // 🔧 Use setter/getter after encapsulation
        System.out.println("Stock adjusted!");
        System.out.println("Current stock: " + stock); // 🔧 Use getter after encapsulation
    }
}