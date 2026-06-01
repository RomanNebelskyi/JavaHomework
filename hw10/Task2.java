package hw10;

import java.util.Scanner;

public class Task2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String myStr = scanner.nextLine();
        myStr = myStr.trim();
        System.out.println("The longest is " + findTheLongest(myStr)+ ", its position is " + findPosition(myStr,findTheLongest(myStr))+ "\n");
        System.out.println("The shortest is " + findTheShortest(myStr)+ ", its position is " + findPosition(myStr, findTheShortest(myStr)));

    }
    public static String findTheLongest(String str)
    {
        String []res = str.split(" ",-1);
        String maxLenght = res[0];
        for(int i = 1;i< res.length;++i)
        {
            if(maxLenght.length()<res[i].length())
            {
                maxLenght = res[i];
            }
        }
        return maxLenght;
    }
    public static String findTheShortest(String str)
    {
        String []res = str.split(" ", -1);
        String minLenght = res[0];
        for(int i = 1;i< res.length;++i)
        {
            if(minLenght.length()>res[i].length())
            {
                minLenght = res[i];
            }
        }
        return minLenght;
    }

    public static int findPosition(String main, String subStr )
    {
        String []res = main.split(" ",-1);
        String maxLenght = res[0];

        for(int i = 0;i< res.length;++i)
        {
            if(res[i].equals(subStr))
            {
                return i+1;
            }

        }
        return -1;
    }

}
