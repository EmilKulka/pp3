public class Clock {
    private int hour;
    private int minute;

    Clock(int hour, int minute) {
        setHour(hour);;
        setMinute(minute);;
    }
    
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setHour(int hour) {
        if(hour >= 0 && hour <= 23) {
            this.hour = hour; 
        }else {
            System.out.println("Invalid hour declaration --> (0-23)");
        }
    }

    public void setMinute(int minute) {
        if(minute >= 0 && minute <= 59) {
            this.minute = minute;
        }else {
            System.out.println("Invalid minute declaration --> (0-59)");
        }
    }

    public void addMinute() {
        if(getMinute() < 59) {
            minute ++;
        }else {
            minute = 0;
            if(getHour() > 23) {
                hour ++;
            }else {
                hour = 0;
            }
        }
    }

    public void displayTime() {
        System.out.printf("%02d:%02d", getHour(), getMinute());
        System.out.println();
    }

    public static void main(String[] args) {
        Clock clock1 = new Clock(23,58);
        clock1.displayTime();
        clock1.addMinute();
        clock1.displayTime();
        clock1.addMinute();
        clock1.displayTime();
        clock1.addMinute();
        clock1.displayTime();
    }
}
