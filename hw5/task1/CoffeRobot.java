package hw5.task1;

public class CoffeRobot extends Robot
{
    CoffeRobot(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void work()
    {
        System.out.println("I*m workign as a coffe robot");
    }

}
