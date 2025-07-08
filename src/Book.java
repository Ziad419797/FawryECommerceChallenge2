//abstract base class
public abstract class Book {
    protected String isbn;
    protected String title;
    protected int year;
    protected double price;
    protected String author;

    public Book(String isbn, String title, int year, double price, String author) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
        this.author = author;
    }

    //getters
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    public String getAuthor() { return author; }


    public boolean isOutdated(int currentYear, int maxAge) {
        return currentYear - year > maxAge;
    }

    public abstract boolean isAvailable();
}
