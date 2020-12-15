package hw5.task2;

public class Car
{
    private String carModel;
    private int carAge;
    private Body body;
    private SteeringWheel steeringWheel1;
    private Wheel wheel1;

    public Car(String carModel, int carAge, Body body, SteeringWheel  steeringWheel1, Wheel wheel1) {
        this.carModel = carModel;
        this.carAge = carAge;
        this.body = body;
        this.steeringWheel1 = steeringWheel1;
        this.wheel1 = wheel1;
    }

    @Override
    public String toString() {
        return "Car{\n" +
                "carModel='" + carModel + '\'' +
                ", \ncarAge=" + carAge +
                ", \nbody=" + body +
                ", \nsteeringWheel1=" + steeringWheel1 +
                ", \nwheel1=" + wheel1 +
                '}';
    }



    public void changeBody(String model,String color ,String type)
    {

        this.body.setColor(color);
        this.body.setModel(model);
        this.body.setType(type);

    }
    public void changeStWheel(int diameter, String model, String type)
    {
        this.steeringWheel1.setDiameter(diameter);
        this.steeringWheel1.setModel(model);
        this.steeringWheel1.setType(type);

    }
    public void changeWheel(int size, String model, String season)
    {
        this.wheel1.setModel(model);
        this.wheel1.setSize(size);
        this.wheel1.setSeason(season);
    }


    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }


    public SteeringWheel getSteeringWheel() {
        return steeringWheel1;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel1 = steeringWheel;
    }

    public Wheel getWheel() {
        return wheel1;
    }

    public void setWheel(Wheel wheel) {
        this.wheel1 = wheel;
    }
}
