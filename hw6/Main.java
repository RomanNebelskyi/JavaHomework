package hw6;
import java.util.Scanner;
public class Main {
    //You can change these values//
    public static Samurai samurai = new Samurai(100, 44, 40);
    public static Archer archer = new Archer(80, 44, 40);
    public static Knight knight = new Knight(150, 44, 40);
    public static Kamikaze kamikaze = new Kamikaze(50, 44, 40);


    public static void main(String[] args) {
        System.out.println("Enter number of warriors in each command");
        Scanner newScan = new Scanner(System.in);

        Warrior[] blue = new Warrior[newScan.nextInt()];
        Warrior[] red = new Warrior[blue.length];

        fillArr(blue);
        fillArr(red);
        while (true) {
            for (int i = 0; i < blue.length; i++) {

                int a = 0;
                int b = blue.length - 1;
                int random_number1 = a + (int) (Math.random() * b);
                int random_number2 = a + (int) (Math.random() * b);
                if (blue[random_number1].isLive() && red[random_number2].isLive()) {

                    blue[random_number1].attack(red[random_number2]);
                }
                random_number1 = a + (int) (Math.random() * b);
                random_number2 = a + (int) (Math.random() * b);

                if (red[random_number1].isLive() && blue[random_number2].isLive()) {
                    red[random_number1].attack(blue[random_number2]);
                }
            }
            if (!checkTeamIsLive(blue) || !checkTeamIsLive(red))
                break;

        }
        if (checkTeamIsLive(blue))
        {
            System.out.println("Blue won");
        }
        else {
            System.out.println("Red won");
        }

    }
        /*for(int i = 0;i<blue.length;i++)
        {
            System.out.println(blue[i].getClass().getName());
        }*/


    public static void fillArr(Warrior[] team )
    {

       int arrLength = 0;
        //to make random warriors
    do{
        double d = Math.random();

        if (d < 0.3)
        team[arrLength] = knight;

        else if (d < 0.5)
            team[arrLength] = archer;

        else if(d<0.7)
            team[arrLength] = samurai;

        else
            team[arrLength] = kamikaze;

        arrLength++;
    }while(arrLength< team.length);

    }
    public static boolean checkTeamIsLive(Warrior[] team)
    {
        boolean check = false;
        for(int i = 0;i< team.length;i++)
        {
            if(!team[i].isLive())
                check = check || team[i].isLive();

            else
                check= true;

        }
        return check;
    }
}
