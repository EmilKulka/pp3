public class CinemaTicket {
    static String cinemaName = "Morning Star Cinema";
    String filmTitle;
    int row;
    int seat;
    double price;

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
    }
}
