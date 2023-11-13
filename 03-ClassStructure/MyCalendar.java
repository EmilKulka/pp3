public class MyCalendar {
    static int year = 2023;
    static int month = 10;
    static int day = 22;
    
    static String myDate() {
        return String.format("%04d-%02d-%02d", year,month,day);
    }

    static int days() { //nie uwzględnia roku przestępnego 
        int[] daysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int totalDays = day;
        for (int i = 1; i < month; i++) {
            totalDays += daysInMonth[i];
        }
        return totalDays;
    }

    static String monthName() {
        String[] monthNames = {
            "", "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month];
    }

    public static void main(String[] args) {
        System.out.println(MyCalendar.myDate());
        System.out.println(MyCalendar.days());
        System.out.println(MyCalendar.monthName());
    }
}
