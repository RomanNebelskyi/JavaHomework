package hw1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        String day;
        Scanner newScan = new Scanner(System.in);
        System.out.println("Enter Mon/Tue/Wed/...");
        day = newScan.nextLine();
        switch (day){
            case ("Mon"):
                System.out.println("1)Walk with my dog.\n2)Meet Susan.");
                break;
            case ("Tue"):
                System.out.println("1)Go hiking.\n2)Play tennis.");
                break;
            case ("Wed"):
                System.out.println("1)Go to the gym.\n.");
                break;
            case ("Thu"):
                System.out.println("1)Read books.\n");
                break;
            case ("Fri"):
                System.out.println("1)Meet with friends.\n2)Listen to music.");
                break;
            case ("Sat"):
                System.out.println("1)Clean the house.\n2)Wash clothes ");
                break;
            case ("Sun"):
                System.out.println("1)Just relax.");
                break;
            default :
                System.out.println("You entered wrong day");
                break;
        }

    }
}