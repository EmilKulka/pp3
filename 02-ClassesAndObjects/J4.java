public class J4 {
    public static void main(String[] args) {
        int hours = 14;
        int minutes = 27;
        //String time = "14:27";
        int minutesFromMidnight = hours * 60 + minutes;
        int secondsFromMidnight = (hours * 3600) + (minutes * 60);
        System.out.println("Hours = " + hours);
        System.out.println("Minutes = " + minutes);
        System.out.printf("time: %02d:%02d%n", hours, minutes);
        System.out.println("Minutes from midnight = " + minutesFromMidnight);
        System.out.println("Seconds from midnight = " + secondsFromMidnight);
    }
}
