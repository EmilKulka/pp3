import java.util.ArrayList;

public class Library  {
    static ArrayList<Book> collection = new ArrayList<>();
    
    public static void main(String[] args) {
        Book book1 = new Book("Pan Taduesz", "Adam Mickiewicz");
        Ebook ebook1 = new Ebook("Dziady", "Adam Mickiewicz", "XYZ");
        Audiobook audiobook1 = new Audiobook("Wesele", "Stanisław Wyspianski",2,30);

        collection.add(book1);
        collection.add(ebook1);
        collection.add(audiobook1);

        for(Book i : collection) {
            i.display();
        }
       
    }

    
}
