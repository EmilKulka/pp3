public class J2 {
    public static void main(String[] args) {
        int speedInKmPerHour = 39;
        boolean isSpeedValid = speedInKmPerHour >= 40 && speedInKmPerHour <= 140;
        System.out.println("Vehicle speed: " + speedInKmPerHour);
        System.out.println("Speed is valid: " + isSpeedValid);
    }
}
