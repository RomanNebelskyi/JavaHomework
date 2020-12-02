package hw1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        float a;
        float b;
        float c;
        double res;

        Scanner newScan = new Scanner(System.in);

        a = newScan.nextFloat();
        b = newScan.nextFloat();
        c = newScan.nextFloat();


        if (0 == a) {
            res = -c / b;
            System.out.println("Result is :" + res);
        } else {
            double disk;
            disk = b * b - 4 * a * c;

            if (disk > 0) {
                double x1 = (-b + ((Math.sqrt(disk)))) / 2 * a;
                double x2 = (-b - ((Math.sqrt(disk)))) / 2 * a;
                System.out.println("X1 is " + x1 + "\n X2 is " + x2);
            } else if (0 == disk) {
                double x = -b / 2 * a;
                System.out.println("X is " + x);

            } else {
                System.out.println("No real roots.");

            }
        }


    }
}