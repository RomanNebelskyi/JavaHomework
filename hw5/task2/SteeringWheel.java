package hw5.task2;

public class SteeringWheel
{
    private int diameter;
    private String model;
    private String type;

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "diameter=" + diameter +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public SteeringWheel(int diameter, String model, String type) {
        this.diameter = diameter;
        this.model = model;
        this.type = type;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
