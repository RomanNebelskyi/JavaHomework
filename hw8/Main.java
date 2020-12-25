package hw8;

import java.util.Scanner;

public class Main extends  Tabulation
{

    // може сканер бути полем? чи краще створювати сканер нижче? чи краще створити
    public static void main(String[] args)
    {    // сканер в мейні, але передавати його в функцію checkMonthExistence()?

        System.out.println("Enter your month \n");
        Scanner scanner = new Scanner(System.in);
        Months months  = checkMonthExistence(scanner.nextLine());
        int choice = 0;

        do {

            System.out.println("Enter next choice \n");
            choice = scanner.nextInt();
            tabulation(choice, months);

        }while (choice!=0);

        /*for(int i = 0;i<Months.values().length;++i)
        {
            months = Months.values()[i];
            System.out.println("Next season of month -- " + months.toString());
            System.out.println(findPreviousSeason(months).toString()+ "\n");
        }*/

    }

}
