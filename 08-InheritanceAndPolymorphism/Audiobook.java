class Audiobook extends Book {
    private int min;
    private int sec;

    public Audiobook(String author, String title, int min, int sec) {
        super(title, author);
        this.min = min;
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public void display() {
        System.out.println("Title is " + getTitle() + ", " + "author is " + getAuthor() + ", " + "duration is " + min + "." + sec + "min");
    }

}
