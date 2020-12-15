package hw5.task2;

public class Body
{
    private String model;
    private String color;
    private String type;

    public Body(String model, String color, String type)
    {
        this.model = model;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Body{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
