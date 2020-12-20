package hw;
import java.util.Scanner;

public class Task4
{

    public static void main(String[] args)
    {
        String main ;
        Scanner newScan = new Scanner(System.in);

        main = newScan.nextLine();
        main = main.toUpperCase();
        String addToMainArr = "";

       while( (Math.sqrt(addToMainArr.length()+ main.length()))  != Math.floor(Math.sqrt(addToMainArr.length()+ main.length())))
       {
           addToMainArr = null;
           System.out.println("You entered not enough symbols. Enter more symbols.");
                addToMainArr = newScan.nextLine();
               addToMainArr = addToMainArr.toUpperCase();
                 main = main.concat(addToMainArr);
                 addToMainArr = "";

       }

        int sizeOfArr = (int) Math.sqrt(main.length());
        String [][]str1 = new String[sizeOfArr][sizeOfArr];
        char [] bufer = new char[main.length()];
        bufer =   main.toCharArray();
        fillMass(bufer, str1, sizeOfArr);


       main = newScan.nextLine();
        main = main.toUpperCase();
       bufer =  main.toCharArray();
        findWord(bufer, str1, sizeOfArr);

        /*if( Math.sqrt(main.length())==0.0 ){


        }
        else{
            String addToMainArr ;

            do{

                addToMainArr = newScan.nextLine();
            }while(Math.sqrt(addToMainArr.length()+ main.length())%2 !=0 );

            main = main.concat(addToMainArr);
            int sizeOfArr = (int) Math.sqrt(main.length());
            String [][]str1 = new String[sizeOfArr][sizeOfArr];
            char []bufer = main.toCharArray();
            fillMass(bufer, str1, sizeOfArr);

        }*/

    }
    static void fillMass(char []bufer , String[][]str1, int sizeOfArr )
    {
        int counter = 0;
        for(int i = 0 ;i < sizeOfArr; i++)
        {
            for(int j = 0 ; j < sizeOfArr ;j++)
            {
            str1[i][j] = String.valueOf(bufer[counter]);
            counter++;
            }
        }
    }
    static void findWord(char []bufer, String[][]str1, int sizeOfArr)
    {
        int counter = 0;
        int checkOutLetters = 0;
        while(counter!= bufer.length) {
            for (int i = 0; i < sizeOfArr; i++)
            {
                for (int j = 0; j < sizeOfArr; j++)
                {

                    if (str1[i][j].equalsIgnoreCase(String.valueOf(bufer[counter])) )
                    {
                        System.out.println(bufer[counter] + "[" + i + "] " + "[" + j + "]");
                        checkOutLetters++;
                        break;
                    }
                }
            }
            counter++;
        }
        if(checkOutLetters != bufer.length )
        {
            System.out.println("Full word isnt found");
        }
    }
}
