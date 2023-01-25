import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Book> books;
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Book book : books) {
            totalCost += book.getPrice();
        }
        return totalCost;
    }

    public void placeOrder() {
        // Code to process the order and send confirmation email to the customer
    }
}