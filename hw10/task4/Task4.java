package hw10.task4;

import hw10.task7.TooManyChars;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws TooManyChars
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.toLowerCase();

        try
        {
            checkLenth(str);
            if (checkIfPalindrom(str))
            {
                System.out.println("Palindrom");
            }
            else
                {
                System.out.println("Not palindrom");
                }

        } catch (TooManyChars tooManyChars)
        {
            System.out.println(tooManyChars);
        }


    }

    public static boolean checkIfPalindrom(String str)
    {
    for(int i = 0, j = str.length() -1 ; i<j ;++i, --j)
    {
        if(str.charAt(i)==str.charAt(j));

        else
            return false;
    }
    return true;
    }

    public static void checkLenth(String str) throws TooManyChars
    {
        if(str.length()>5)
            throw new TooManyChars("Too many chars! ( >5)");
    }
}
