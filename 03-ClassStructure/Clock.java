public class Clock {    
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;
    Clock() {
        this.hour = 0;
        this.minute = 0;
    }

    Clock(int hour,int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    void setClock(int hour,int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    void setClock() {
        hour = 0;
        minute = 0;
    }

    void displayTime() {
        System.out.printf("The time is: %02d:%02d",hour,minute);
        System.out.println("\n");
    }

    void addOneMinute() {
        if(minute < 59) {
            minute ++;
        }
        else {
            minute =  0;
            if(hour < 23) {
                hour ++;
            }else {
                hour = 0;
            }
        }
        if(hour == alarmHour && minute == alarmMinute) {
            runAlarm();
        }
    }

    void setAlarm(int alarmHour, int alarmMinute) {
        this.alarmHour = alarmHour;
        this.alarmMinute = alarmMinute;
    }

    void runAlarm() {
        System.out.println("\n"+"beep-beep-beep-beep !!");
    }

    public static void main(String[] args) {
        Clock clock1 = new Clock(23,58);
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
        clock1.setAlarm(0, 0);
        clock1.addOneMinute();
        clock1.displayTime();
    }
}
