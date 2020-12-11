package hw5.task2;

public class Main
{


    public static void main(String[] args)
    {

        SteeringWheel st1 = new SteeringWheel(16,"Model", "Type");
        Body b1 = new Body("Mp", "white", "sport");
        Wheel wh1 = new Wheel(17, "Super", "winter");
        Car car1 = new Car("Ferrari", 2007, b1, st1, wh1 );
        System.out.println(car1.toString());

        System.out.println("\n");

        car1.changeBody("NP", "red", "standart");
        System.out.println("body type is " +b1.getType());
        b1.setType("CLASSIC");
        System.out.println("body type is " +b1.getType());
        car1.changeStWheel(16, "Michelin", "standart");
        car1.changeWheel(14,"New Model", "winter");
        System.out.println("After changes");
        System.out.println(car1.toString());

    }




 //Car car = new Car("Lamb", 2, "Coupe", 23, 23, "");

}
