public class CinemaTicket {
<<<<<<< HEAD
    static String cinemaName = "Morning Star Cinema";
    String filmTitle;
=======
    static String cinemaName = "XYZ";
    String filmName;
>>>>>>> af63efe437d3c64158790ede3b8cf6d608e590aa
    int row;
    int seat;
    double price;

<<<<<<< HEAD
    public String displayTicket() {
        return "Cinema: " + cinemaName + "\n" +
        "Film Tittle : " + filmTitle + "\n" +
        "Row : " + Integer.toString(row) + "\n" +
        "Seat: " + Integer.toString(seat) + "\n" +
        "Price: " + Double.toString(price) + "\n";
    }

    public CinemaTicket(String filmTittle,int row,int seat) {
        this.filmTitle = filmTittle;
        this.row = row;
        this.seat = seat;
        if (row <= 2) {
            this.price = 10.0;
        }
        else {this.price = 25.0;
        }
    }


    public static void main(String[] args) {
        CinemaTicket ticket1 = new CinemaTicket("Gladiator", 2,20);
        CinemaTicket ticket2 = new CinemaTicket("Gladiator", 7,15);

        System.out.println(ticket1.displayTicket());
        System.out.println(ticket2.displayTicket());
=======
    // static String displayTicket(String filmName,int row,int seat,double price) {
    //     return "Cinema name: " + cinemaName + "\n" +
    //     "Film name: " + filmName + "\n" + 
    //     "Row: " + Integer.toString(row) +  "\n" +
    //     "Seat: " + Integer.toString(seat)  + "\n" +
    //     "Price: " + Double.toString(price) + "\n" ;
    // }

    static String toString(String filmName,int row,int seat,double price) {
        return "Cinema: " + cinemaName + "\n" +
                "Film Title: " + filmName + "\n" +
                "Row: " + row + "\n" +
                "Seat: " + seat + "\n" +
                "Price: $" + price;
    }
    public static void main(String[] args) {
        System.out.println(CinemaTicket.toString("Harry Potter", 5, 20, 23.5));
>>>>>>> af63efe437d3c64158790ede3b8cf6d608e590aa
    }
}
