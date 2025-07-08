public class EBook extends Book implements Emailable {
    private String filetype;

    public EBook(String isbn, String title, int year, double price, String author, String filetype) {
        super(isbn, title, year, price, author);
        this.filetype = filetype;
    }

    public String getFiletype() {
        return filetype;
    }

    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public void sendTo(String email) {
        System.out.println("Quantum book store >> Sending EBook to: " + email);
    }
}
