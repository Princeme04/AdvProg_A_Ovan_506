package module2.codelab;

// Main application class
public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Refactoring in Java");
        book.setAuthor("Ir. Wildan Suharso");
        book.setStock(10);
        book.setPrice(120000);

        Library library = new Library();
        library.setBook(book);
        library.setLocation("UMM Informatics Building");

        library.showLibraryInfo();
    }
}
