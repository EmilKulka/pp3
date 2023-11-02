public class CinemaTicket {
    static String cinemaName = "XYZ";
    String filmName;
    int row;
    int seat;
    double price;

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
    }
}
