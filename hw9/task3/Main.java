package hw9.task3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
       MyCalculator myCalculator = new MyCalculator();
        Scanner scanner = new Scanner(System.in);

        try{

            int a = scanner.nextInt(), b = scanner.nextInt();
            char choice = scanner.next().charAt(0);

            System.out.println(myCalculator.myCl(a, b, choice));

        }catch (MyException myException){
            System.out.println("111My exception");
        }
        catch (IllegalArgumentException illegalArgumentException){
            System.out.println("111IllegalArgumentException");
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("111ArithmeticException");
        }

    }
}
