package hw9.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner  = new Scanner(System.in);
        String number1 = scanner.nextLine();
        String number2  = scanner.nextLine();
        try
        {
            System.out.println("Sum is " +( Integer.parseInt(number1) +  Integer.parseInt(number2)));
        }catch (NumberFormatException a)//можна користуватись "чужими" ексепшинами? чи краще написати свій?
        {
            System.out.println("Number 1 or number 2  is/are wrong");
        }
    }





}
