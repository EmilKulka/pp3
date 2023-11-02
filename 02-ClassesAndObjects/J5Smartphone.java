public class J5Smartphone {
    String owner;
    int batteryCapacity;
    int numberOfAparats;
    String operatingSystem;
    float price;

    boolean isOn;
    void turnOnOf() {
        isOn = !isOn;
    }

    void checkOperatingSystem() {
        System.out.println("Operating system is " + operatingSystem);
    }

    void sayHelloToOwner() {
        System.out.println("Hello" + owner);
    }
}