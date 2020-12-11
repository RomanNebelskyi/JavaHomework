package hw5.task3;

public class Main
{
    public static void main(String[] args) {
        Animal animal = new Animal("Monkey", 10, 3 );
        System.out.println(animal.getAllParams());
        animal.setAllParams("Tiger", 30, 4);
        System.out.println(animal.getAllParams());


    }

}
