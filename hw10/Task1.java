package hw10;

public class Task1
{
    public static void main(String[] args)
    {

        String str = "I like Java !!!";
        System.out.println(str.substring(str.length()-2, str.length()-1));
        System.out.println("Ends with !!! " + str.endsWith("!!!"));
        System.out.println("Starts with I like " + str.startsWith("I like"));
        System.out.println("Contains Java "+ str.contains("Java") );
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(str.indexOf("J"),str.lastIndexOf(" !")));



    }

}
