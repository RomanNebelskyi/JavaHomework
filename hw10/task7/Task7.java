package hw10.task7;


import java.util.Scanner;

public class Task7
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        try {
            String str = scanner.nextLine();
            checkLenth(str);
            System.out.println(findMiddleLetters(str));
        }catch (TooManyChars tooManyChars)
        {
            System.out.println(tooManyChars);
        }

    }

    public static void checkLenth(String str) throws TooManyChars
    {
    if(str.length()%2!=0)
        throw new TooManyChars("Num of chars arent even!");
    }

    public static String findMiddleLetters(String str)
    {
        return str.substring(str.length()/2-1, str.length()/2+1);
    }



}



