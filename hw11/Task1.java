package hw11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String []words = separateWords(input);

        Pattern pattern = Pattern.compile("^[a].*");
        Matcher matcher;

        for(int i = 0;i<words.length;++i)
        {
            matcher = pattern.matcher(words[i]);
            if(matcher.matches())
            {
                System.out.println(words[i]);
            }

        }
    }

    public static String[] separateWords(String string)
    {
        return string.split(" ", -1);
    }

}
