package hw2;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        int result;
        Scanner newScan = new Scanner(System.in);

        System.out.println("5*3 =  ");

        do {
            result = newScan.nextInt();

        }while (result!=15);

        System.out.println( result + " is correct!");
    }
}
