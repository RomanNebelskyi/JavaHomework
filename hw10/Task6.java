package hw10;

import java.util.Scanner;

public class Task6
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       String string = scanner.nextLine();
       String[] separatedWords = string.split(" ", -1);
        int check = 3;
        for(int i = 0;i< separatedWords.length;i++)
        {

            if(separatedWords[i].equalsIgnoreCase("Object-oriented"))
            {
                if(separatedWords[i+1].equalsIgnoreCase("programming")&& check%2==0)
                {
                  separatedWords[i] = separatedWords[i].replaceAll("^(.*)+([-])+(.*)$", "OOP");
                  separatedWords[1+i] = separatedWords[i+1].replaceAll(".*", "");
                  compressArr( separatedWords, i+1);
                }
                ++check;
            }
        }

        for(int i = 0;i<separatedWords.length;++i)
        {
            System.out.print(separatedWords[i]+ " ");
        }



    }

    public static void compressArr(String arr[], int pos)  // To avoid 2 spaces (Before : "OOP  blabla", After : "OOP blabla")
    {

        for (; pos < arr.length-1; ++pos){
            if(pos == arr.length/2){

                break;
            }
            arr[pos] = arr[pos+1];

        }

    }


}
