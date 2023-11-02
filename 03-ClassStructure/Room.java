public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;

    Room(int number) {
        this.number = number;
        this.beds = 2;
    }
    
    Room(int number, int beds) {
        this.number = number;
        this.beds = beds;
    }

    void checkin(String guestName) {
        this.guestName = guestName;
        this.occupied = true;
    }

    void checkout() {
        this.guestName = "";
        this.occupied = false;
    }

    String isOccupied() {
        return occupied ? "Yes" : "No";
    }

    void displayStatus() {
        System.out.println("Guest name is: " + guestName + "\n" + 
        "Room number is: " + number + "\n" + 
        "Number of beds is: " + beds + "\n" +
        "Room is occupied: " + isOccupied());
    }

    static void roomsReport(Room[] rooms) {
        for(Room room: rooms) {
            room.displayStatus();
        }
    }

    public int getBeds() {
        return beds;
    }

    static void roomsWithXBedsReport(Room[] rooms, int beds) {
        for(Room room : rooms) {
            if(room.getBeds() == beds) {
                room.displayStatus();
            }
        }
    }

    static void VacantOccupiedRooms(Room[] rooms) {
        int vacantRooms = 0;
        int occupiedRooms = 0;

        for(Room room : rooms) {
            if(room.isOccupied() == "Yes") {
                occupiedRooms ++;
            }
            else{
                vacantRooms ++;
            }
        }
        System.out.println("Vacant rooms: " + vacantRooms);
        System.out.println("Occupied rooms: " + occupiedRooms);
    }

    static void vacantBeds(Room[] rooms) {
        int sum = 0;
        for(Room room : rooms) {
            if(room.isOccupied() == "No") {
                sum += room.getBeds();
        }
    }
    System.out.println("Vacant beds: " + sum);
}
    public static void main(String[] args) {
        Room[] rooms = new Room[6];
        rooms[0] = new Room(101);
        rooms[1] = new Room(102);
        rooms[2] = new Room(201, 3);
        rooms[3] = new Room(202, 3);
        rooms[4] = new Room(301);
        rooms[5] = new Room(401, 1);

        //rooms[0].displayStatus();

        // roomsReport(rooms);
        roomsWithXBedsReport(rooms, 3);
    }
}
