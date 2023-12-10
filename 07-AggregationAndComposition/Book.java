public class Book {
    private String title;
    private int pages;
    private Writer author;

    public Book(String title, Writer author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public Writer getAuthor() {
        return author;
    }

    public void setAuthor(Writer author) {
        this.author = author;
    }
    
    public static void main(String[] args) {
        Writer author1 = new Writer("Mickiewicz");
        Book book1 = new Book("Pan Tadeusz", author1);
        System.out.println(book1.getAuthor().getSurname());
        author1.setSurname(null);
        System.out.println(book1.getAuthor().getSurname());

    }

    
}
