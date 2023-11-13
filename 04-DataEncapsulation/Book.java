public class Book {
    private String tittle;
    private int pages;
    

    public String getTittle() {
        return this.tittle;
    }

    public int getPages() {
        return this.pages;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setPages(int pages) {
        if(pages > 0) {
            this.pages = pages;
        }
    }

    public void displayInfo() {
        System.out.println("Tittle is " + getTittle());
        System.out.println("Number of pages is " + getPages());
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.setTittle("XYZ");
        b.setPages(3);
        b.setPages(0);
        b.displayInfo();

    }
}
