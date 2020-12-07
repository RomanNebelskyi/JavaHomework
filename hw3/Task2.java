package hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int []arr = new int[10];
        Scanner newScan = new Scanner(System.in);

        for(int i = 0; i<arr.length; i++) {
            arr[i] = newScan.nextInt();

        }
        for(int i = arr.length-1; i>= 0;i-- ){
            System.out.print(arr[i] +" " );

        }


    }
}
