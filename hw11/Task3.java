package hw11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3
{
    public static void main(String[] args)
    {
        String str = "I love Java more than my friend. Java is so beautiful.";
        Pattern pattern = Pattern.compile(".*Java.*");
        Matcher matcher = pattern.matcher(str);

        if(matcher.matches())
        {
            System.out.println(str.getClass().getSimpleName()+ " consists \"Java\".");
        }
        else
            {
                System.out.println("Doesn*t have");
            }

        str =  str.replaceFirst("Java", "C#");
        System.out.println(str);

        str = str.replaceAll("Java", "C#");
        System.out.println(str);
    }
}
