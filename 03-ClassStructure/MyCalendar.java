public class MyCalendar {
    static int year = 2023;
    static int month = 10;
    static int day = 24;
    

    static String myDate() {
        return String.format("%04d-%02d-%02d",year,month,day);
    }

    static int days() {
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int daysFinal = day;
        for (int i = 0; i < month - 1; i++) {
            daysFinal += daysInMonth[i];
        }
        return daysFinal;
    }

    static String monthName() { 
        String[] monthNames = {"January", "February", "March", 
        "April", "May", "June", "July", "August", "September", 
        "October","November", "December"};
        return monthNames[month - 2];
    }

    public static void main(String[] args) {
        System.out.println(MyCalendar.myDate());
        System.out.println(MyCalendar.days());
        System.out.println(MyCalendar.monthName());
    }
}
