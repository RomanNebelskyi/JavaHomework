package hw11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task2
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input  = scanner.nextLine();
        String [] mails = separateWords(input);

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.+-]+@gmail.com");
        Matcher matcher;

        for(int i = 0;i<mails.length;++i)
        {
            matcher = pattern.matcher(mails[i]);
            if( matcher.matches())
            {
                System.out.println(mails[i]);
            }
        }

    }


    public static  String [] separateWords (String input)
    {
        return input.split(" ",-1);
    }





}
