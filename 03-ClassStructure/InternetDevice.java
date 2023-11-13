public class InternetDevice {
    String deviceName;
    boolean connected = false;
    static int connectedDevices = 0;

    public InternetDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public void connect(){
        connected = true;
        connectedDevices ++;
    }

    public void disconnect(){
        connected = false;
        connectedDevices --;
    }

    public void isConnected() {
        System.out.println("The device is " + 
        (connected ? "connected." : "disconnected."));
    }

    public void displayStatus() {
        System.out.println("The device name is " + deviceName + 
        " The device is " + (connected ? "connected." : 
        "disconnected."));
    }

    static String displayConnections() {
        return "Number of connected devices is " + connectedDevices;
    }

    public static void main(String[] args) {
        InternetDevice device1 = new InternetDevice("Iphone Emil");
        device1.connect();
        device1.isConnected();
        device1.displayStatus();
        
        InternetDevice device2 = new InternetDevice("Iphone Nikola");
        device2.isConnected();
        device2.displayStatus();

        InternetDevice device3 = new InternetDevice("Iphone George");
        device3.connect();
        device3.isConnected();
        device3.displayStatus();
        System.out.println(InternetDevice.displayConnections());


    }

}
