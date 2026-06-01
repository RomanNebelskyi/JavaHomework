package hw10;

import java.util.Scanner;

public class Task3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String []sub = str.split(" ", -1);

        for(int i = 0; i< sub.length;++i)
        {
            if(findWord(sub[i],"a") && (sub[i].toCharArray().length %2 == 0) )
            {
                System.out.println(sub[i]);
            }

        }


    }

    public static boolean findWord(String subString, String ch)
    {

        if( subString.substring(0,1).contains(ch))
        {
            return true;
        }
        return false;
    }
}
