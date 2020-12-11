package hw5.task1;

public class Main
{
    public static void main(String[] args)
    {
        Robot robot1 = new Robot("Jason", 2);
        robot1.work();

        RobotCooker robot2 = new RobotCooker("Albert", 1);
        robot2.work();

        RobotDancer robot3 = new RobotDancer("Frank", 3);
        robot3.work();

        CoffeRobot robot4 = new CoffeRobot("Tim", 4);
        robot4.work();

        System.out.println();

        Robot []robots = new Robot[4];
        robots[0] = new Robot("Coffe1", 1);
        robots[1] = new CoffeRobot("Coffe", 3);
        robots[2] = new RobotCooker("Cook", 2);
        robots[3] = new RobotDancer("Dance", 4);

        for(int i = 0; i< robots.length;i++)
        {
            robots[i].work();
        }
    }
}
