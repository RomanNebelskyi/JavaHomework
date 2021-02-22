package hw9.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner  = new Scanner(System.in);
        var number = scanner.nextLine();
        try
        {
            checkNumber(number);

            if(isEven(Integer.parseInt(number)))
                System.out.println("Number is even");
            else
                System.out.println("Number is odd");

        }catch (NotIntegerNumber a)
        {
            System.out.println("Num is wrong");
        }
    }

    public static void checkNumber( String line) throws NotIntegerNumber
    {
      if(line.contains("."))
        throw new NotIntegerNumber();
    }
    public static boolean isEven(int num)
    {
        if (num % 2 == 0)
            return true;

        return false;
    }


}
