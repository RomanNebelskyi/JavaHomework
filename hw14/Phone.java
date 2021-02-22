package hw14;

public class Phone implements Comparable<Phone>
{
    private String model;
    private int battery;
    private int camera;

    public Phone(String model, int battery, int camera) {
        this.model = model;
        this.battery = battery;
        this.camera = camera;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }



    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                ", battery=" + battery +
                ", camera=" + camera +"\n";
    }

    @Override
    public int compareTo(Phone o) {
        return 0;
    }
}
