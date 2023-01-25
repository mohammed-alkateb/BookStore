import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bookstore {
    public static Book createBook(String title, String author, String ISBN, double price) {
        return new Book(title, author, ISBN, price);
    }

    public static List<Book> addBookToCart(Book book, List<Book> cart) {
        return Stream.concat(cart.stream(), Stream.of(book)).collect(Collectors.toList());
    }

    public static List<Book> removeBookFromCart(Book book, List<Book> cart) {
        return cart.stream().filter(b -> !b.getISBN().equals(book.getISBN())).collect(Collectors.toList());
    }

    public static double calculateTotalCost(List<Book> books) {
        return 0.0; // get book price
    }

    public static double placeOrder(List<Book> books, String customerName, String customerEmail, String customerAddress) {
        return calculateTotalCost(books);
    }

    public static List<Book> searchBooks(List<Book> books, String keyword) {
        List<Book> searchResults = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword)) {
                searchResults.add(book);
            }
        }
        return searchResults;
    }

    public static void displayBooks(List<Book> books) {
        books.forEach(b -> {
            System.out.println("Title: " + b.getTitle());
            System.out.println("Author: " + b.getAuthor());
            System.out.println("ISBN: " + b.getISBN());
            System.out.println("Price: " + b.getPrice());
            System.out.println("------------------------------");
        });
    }
}