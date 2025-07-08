import java.util.*;

public class Inventory {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
        System.out.println("Quantum book store >> Added book: " + book.getTitle());
    }

    public List<Book> removeOutdatedBooks(int currentYear, int maxAge) {
        List<Book> removed = new ArrayList<>();
        Iterator<Map.Entry<String, Book>> iterator = books.entrySet().iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next().getValue();
            if (book.isOutdated(currentYear, maxAge)) {
                removed.add(book);
                iterator.remove();
                System.out.println("Quantum book store >> Removed outdated book: " + book.getTitle());
            }
        }
        return removed;
    }

    public double buyBook(String isbn, int quantity, String email, String address) {
        if (!books.containsKey(isbn)) throw new IllegalArgumentException("Quantum book store >> Book not found");
        Book book = books.get(isbn);

        if (!book.isAvailable()) throw new IllegalArgumentException("Quantum book store >> Book not available");

        double total = 0.0;
        if (book instanceof PaperBook pb) {
            pb.reduceStock(quantity);
            total = pb.getPrice() * quantity;
            pb.sendTo(address);
        } else if (book instanceof EBook eb) {
            total = eb.getPrice() * quantity;
            eb.sendTo(email);
        } else {
            throw new IllegalArgumentException("Quantum book store >> Book is not for sale");
        }

        System.out.println("Quantum book store >> Book purchased: " + book.getTitle() + " | Amount: " + total);
        return total;
    }
}
