package module2.codelab;

// Library class to store library location and a book
class Library {
    private Book book;       // 🔧 Encapsulate Field: make private, add getter/setter
    private String location; // 🔧 Encapsulate Field: make private, add getter/setter

    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }

    public String getLocation() {
        return location; }
    public void setLocation(String location) {
        this.location = location; }

    public void showLibraryInfo() {
        System.out.println("Library Location: " + location); // 🔧 Use getter after encapsulation
        book.displayInfo(); // ✅ No change needed once Book is refactored
    }
}