public class J1 {
    public static void main(String[] args) {
        int heightInCm = 180;
        double inches = heightInCm / 2.54;
        int feets = (int) inches / 12;
        int remainingInches = (int) inches % 12;
        System.out.println("I am " + heightInCm + "cm tall, i.e. " + feets + " feet and " + remainingInches + " inches.");

    }
}
