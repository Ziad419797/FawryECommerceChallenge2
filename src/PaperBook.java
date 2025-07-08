public class PaperBook extends Book implements Shippable {
    private int stock;

    public PaperBook(String isbn, String title, int year, double price, String author, int stock) {
        super(isbn, title, year, price, author);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int qty) {
        if (qty > stock) throw new IllegalArgumentException("Not enough stock");
        stock -= qty;
    }

    @Override
    public boolean isAvailable() {
        return stock > 0;
    }

    @Override
    public void sendTo(String address) {
        System.out.println("Quantum book store >> Shipping to: " + address);
    }
}
