package hw8;

public class Tabulation extends  Functions
{


    public static int tabulation(int a, Months months)
    {
        switch (a)
        {
            case 1:
                if( months!=null)
                {
                    System.out.println("Exists");
                }
                else
                {
                    System.out.println("Doesn*t exist");
                }
                return 1;
            case 2:
                System.out.println("Same seasons");
                findSameSeason(months);
                System.out.println();
                return 1;
            case 3:
                System.out.println("Same days");
                findSameDays(months);
                System.out.println();
                return 1;

            case 4:
                System.out.println("less days");
                findLessDays(months);
                System.out.println();
                return 1;
            case 5:
                System.out.println("Same days");
                findMoreDays(months);
                return 1;
            case 6:
                System.out.println("Next season of month -- " + months.toString());
                System.out.println(findPreviousSeason(months).toString()+ "\n");
                return 1;
            case 7:
                System.out.println("Even months ");
                System.out.println(findEvenMonth().toString());
                return 1;
            case 8:
                System.out.println("Odd months");
                System.out.println(findOddMonth().toString());
                return 1;
            case 9:
                System.out.println("Month is Even : ");
                System.out.println(checkEvenOdd(months));
                return 1;
            case 0:
                return 0;
        }

        return -1;
    }

}
