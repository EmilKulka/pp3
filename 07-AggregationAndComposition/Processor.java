public class Processor {
    private String model;
    private String brand;
    private float speedInGhz;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public float getSpeedInGhz() {
        return speedInGhz;
    }
    public void setSpeedInGhz(float speedInGhz) {
        this.speedInGhz = speedInGhz;
    }

    public int calculate(int x, int y) {
        return x+y;
    }
}
