public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, int year, double price, String author) {
        super(isbn, title, year, price, author);
    }

    //always false (online only)
    @Override
    public boolean isAvailable() {
        return false;
    }
}
