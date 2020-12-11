package hw5.task1;

public class RobotCooker extends Robot
{
    RobotCooker(String name, int age)
    {
        super(name, age);
    }
    
    @Override
    public void work()
    {
        System.out.println("I*m workign as a cooker robot");
    }

}
