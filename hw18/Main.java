package Soft.hw18;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Enter num of nums");
        MyThread myThread = new MyThread(1000, scanner.nextInt());

        myThread.start();*/


        System.out.println("Enter num of nums");
        RunnableThread runnableThread = new RunnableThread(1000, scanner.nextInt());
        runnableThread.run();


    }
}
