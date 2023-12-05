public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Pan Taduesz", "Adam Mickiewicz");
        Book book2 = new Book("Zemsta","Aleksander Fredro");

        book1.getAuthor();
        book1.getTitle();
        book2.getAuthor();
        book2.getTitle();

        book1.display();
        book2.display();

        Ebook ebook1 = new Ebook("Dziady", "Adam Mickiewicz", "XYZ");
        ebook1.display();

        Audiobook audiobook1 = new Audiobook("Wesele", "Stanisław Wyspianski",2,30);
        audiobook1.getMin();
        audiobook1.getSec();
        audiobook1.display();
    }
}
