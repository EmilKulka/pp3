public class J6Books {
    String author;
    String literaryGenre;
    String tittle;
    int numberOfPages;
    String yearOfPublication;

    boolean isBookOpen;
    void bookOpenAndClose(boolean isOpen) {
        isBookOpen = isOpen;
        System.out.println("Book is " + (isBookOpen ? "Opened" : "Closed"));
    }

    void displayAuthor() {
        System.out.println("An author is " + author);
    }

    void bookInfo () {
        System.out.println("The tittle of the book is " + tittle);
        System.out.println("The literary genre of the book is " + literaryGenre + " and it has " + numberOfPages + " pages");
        System.out.println(tittle + " was published in " + yearOfPublication);
    }

    public static void main(String[] args){
        J6Books book1 = new J6Books();
        book1.author = "Adam Mickiewicz";
        book1.tittle = "Pan Taduesz";
        book1.literaryGenre = "Epopeja";
        book1.yearOfPublication = "1834";
        book1.numberOfPages = 376;

        book1.displayAuthor();
        book1.bookOpenAndClose(true);
        book1.bookInfo();

        J6Books book2 = new J6Books();
        book2.author = "Władysław Reymont";
        book2.tittle = "Chłopi";
        book2.literaryGenre = "Powieść";
        book2.yearOfPublication = "1904";
        book2.numberOfPages = 728;

        book2.displayAuthor();
        book2.bookOpenAndClose(false);
        book2.bookInfo();

    }

}
