public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Book paperBook1 = new PaperBook("P001", "Ard Zekola", 2015, 240.0, "Amr Abdelhamed", 5);
        Book paperBook2 = new PaperBook("P002", "Ard Zekola Part 2", 2016, 150.0, "Amr Abdelhamed", 7);
        Book eBook1 = new EBook("E001", "Torab Elmass", 2018, 225.0, "Ahmed Mourad", "PDF");
        Book eBook2 = new EBook("E002", "Ard Allah", 2016, 185.0, "Ahmed Mourad", "PDF");
        Book showcaseBook1 = new ShowcaseBook("S001", "The Secret", 2025, 999.0, "Ghost");

        inventory.addBook(paperBook1);
        inventory.addBook(paperBook2);
        inventory.addBook(eBook1);
        inventory.addBook(eBook2);
        inventory.addBook(showcaseBook1);

        inventory.removeOutdatedBooks(2025, 10);

        inventory.buyBook("P001", 2, "ziad@fawry.com", "Shorouk, Cairo");
        inventory.buyBook("E001", 1, "eiad@fawry.com", "");
        inventory.buyBook("E002", 1, "mohamed@fawry.com", "");

        try {
            inventory.buyBook("S001", 1, "kenzy@fawry.com", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
