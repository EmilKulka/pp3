public class Tv implements CanOnOff, CanChangeChannel{   
    boolean isOn;
    int channel;

    public Tv() {
        this.isOn = false;
        this.channel = 1;
    }

    public void turnOn() {
        isOn = true;
    }
    
    public void turnOff() {
        isOn = false;
    }

    

    @Override
    public void channelDown() {
        if(isOn == true) {
            if(channel > 1) {
                channel --;
            }
        }
        
    }

    @Override
    public void channelUp() {
        if(isOn == true) {
            if(channel < 99) {
                channel ++;
            }
        }
        
    }

    public String displayStatus() {
        return isOn ? "TV is on, channel is " + + channel : "TV is off.";
    }


    public static void main(String[] args) {
        Tv t1 = new Tv();
        System.out.println(t1.displayStatus());
        t1.turnOn();
        System.out.println(t1.displayStatus());
        t1.channelUp();
        System.out.println(t1.displayStatus());
    }
}
