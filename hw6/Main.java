package hw6;
import java.util.Scanner;
public class Main {
    //You can change these values//
    public static Samurai samurai = new Samurai(100, 36, 40);
    public static Archer archer = new Archer(90, 20, 40);
    public static Knight knight = new Knight(150, 25, 40);
    public static Kamikaze kamikaze = new Kamikaze(70, 40, 40);


    public static void main(String[] args) {
        System.out.println("Enter number of warriors in each command");
        Scanner newScan = new Scanner(System.in);

        Warrior[] blue = new Warrior[newScan.nextInt()];
        Warrior[] red = new Warrior[blue.length];

        fillArr(blue);
        fillArr(red);

        while (checkTeamIsLive(blue) && checkTeamIsLive(red))
        {

            for (int i = 0; i <= blue.length; i++) {
                int a = 0;
                int b = blue.length;
                int random_number1 = a + (int) (Math.random() * b);
                int random_number2 = a + (int) (Math.random() * b);

                random_number1 = a + (int) (Math.random() * b);
                random_number2 = a + (int) (Math.random() * b);

                if ((a + (int) (Math.random() * b)) % 2 == 0) {
                    if (red[random_number1].isLive() && blue[random_number2].isLive()) {
                        red[random_number1].attack(blue[random_number2]);
                    }
                    random_number1 = a + (int) (Math.random() * b);
                    random_number2 = a + (int) (Math.random() * b);
                    if (blue[random_number1].isLive() && red[random_number2].isLive()) {
                        blue[random_number1].attack(red[random_number2]);
                    }
                }
                else {
                    if (blue[random_number1].isLive() && red[random_number2].isLive()) {
                        blue[random_number1].attack(red[random_number2]);
                    }
                    random_number1 = a + (int) (Math.random() * b);
                    random_number2 = a + (int) (Math.random() * b);
                    if (red[random_number1].isLive() && blue[random_number2].isLive()) {
                        red[random_number1].attack(blue[random_number2]);
                    }

                }
            }

        }
        if(checkTeamIsLive(blue))
        {
            System.out.println("Blue won");
        }
        else if(checkTeamIsLive(red))
        {
            System.out.println("Red won");
        }
        else
        {
            System.out.println("Draw!");
        }

        for(int i = 0;i< blue.length;i++)
        {
            System.out.println(blue[i].isLive() + " - blue isLive");
        }
        for(int i = 0;i< blue.length;i++)
        {
            System.out.println(red[i].isLive() + " - red isLive");
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
       int check = 0;
        for(int i = 0; i< team.length;i++)
        {
            if(team[i].isLive())
            {
                ++check;
            }

        }
        if(check!= 0){
            return true;
        }
        else{

            return false;
        }

    }

    public static void teamFight(double randomNum1 , double randomNum2){}
}
