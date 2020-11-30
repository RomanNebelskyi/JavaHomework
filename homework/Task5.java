package hw1;

import java.util.Scanner;

public class Task5 {
    static double LimNum = 10;
    public static void main(String[] args) {
        double n,m;
        Scanner newScan = new Scanner(System.in);
        n= newScan.nextDouble();
        m= newScan.nextDouble();
        checkCloser(n,m);
    }

    static double findAbs(double number){
        number=number-LimNum;
        if(number>=0){
            return number;
        }
        else{
            return -number;
        }
    }

    static int checkCloser(double n, double m){

        if(findAbs(n)>findAbs(m)){
            System.out.println("Number "+ m+ " is closer");
        }
        else if (findAbs(n)<findAbs(m)){
            System.out.println("Number "+n+ " is closer");
        }
        else{
            System.out.println("They*re on the same distance");

        }
        return 0;
    }

}