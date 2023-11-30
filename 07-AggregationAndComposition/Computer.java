public class Computer {
    private Processor processor;
    private int ram;
    private int storage;
    private boolean power = false;

    public Computer() {
        processor = new Processor();
    }

    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void start() {
        this.power = true;
    }

    public void shutdown() {
        this.power = false;
    }

    public static void main(String[] args) {
        Computer comp = new Computer();
        System.out.println(comp.getProcessor().calculate(2,1));
    }

    
    

    


}