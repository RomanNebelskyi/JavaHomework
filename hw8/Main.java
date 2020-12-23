package hw8;

import java.util.Scanner;

public class Main extends Functions
{

    // може сканер бути полем? чи краще створювати сканер нижче? чи краще створити
    public static void main(String[] args)
    {    // сканер в мейні, але передавати його в функцію checkMonthExistence()?

        Scanner scanner = new Scanner(System.in);
       Months months = checkMonthExistence(scanner.nextLine());

            if( months!=null)
            {
                System.out.println("Exists");
            }
            else
            {
                System.out.println("Doesn*t exist");
            }
        System.out.println("Same seasons");
            findSameSeason(months);
        System.out.println();
        System.out.println("Same days");
            findSameDays(months);
        System.out.println();
        System.out.println("less days");
        findLessDays(months);
        System.out.println();
        System.out.println("Same days");
        findMoreDays(months);
        System.out.println("Next season");
        System.out.println();findNextSeason(months);
    }

}
