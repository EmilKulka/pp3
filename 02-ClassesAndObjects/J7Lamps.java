public class J7Lamps {
    boolean isLampOn;

    void switchingOnOff(boolean isOn) {
        isLampOn = isOn;
        System.out.println("The lamp is " + (isLampOn ? "On" : "Off."));
    }

    public static void main(String[] args) {
        J7Lamps Lamp1 = new J7Lamps();
        Lamp1.switchingOnOff(true);

        J7Lamps Lamp2 = new J7Lamps();
        Lamp2.switchingOnOff(false);
    }
}
