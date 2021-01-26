
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<String > integerList = new ArrayList();
        String buf ="";

        Scanner scanner = new Scanner(System.in);
        System.out.println("use ENTER after every word\n");

       while (!( buf.equals("break") ))
       {
        buf = scanner.nextLine();
        integerList.add(buf);
        }
        integerList.remove(buf); // to remove break word

       try
       {
            if(integerList.isEmpty())
                throw new Exception("Zero length of ArrayList!");

       }
       catch (Exception e)
       {
           System.out.println(e);
           return;
       }

        for (int i  = 0;i< integerList.size();++i)
        {
            if (!(integerList.get(i).indexOf("s") == 0))
                System.out.println(integerList.get(i));
        }
        System.out.println();

        for (int i  = 0;i< integerList.size();++i)
        {
            if (integerList.get(i).length() > 5)
                System.out.println(integerList.get(i));
        }
        System.out.println();

        if(integerList.size()>5)
            integerList= (ArrayList<String>) integerList.subList(0,4);

        for (int i  = 0;i< integerList.size();++i)
        {
                System.out.println(integerList.get(i));
        }
    }
    /*static void printList(List<?> list)
    {
        for(Object o: list)
        {
            System.out.println(o);
        }
        System.out.println();

    }

    static void delString(List<String> list, String str, int pos)
    {
        if (pos == -1)
        {
            for (int i  = 0;i< list.size();++i)
            {
                if (list.get(i).contains(str) )
                    list.remove(list.get(i));
            }
        }

        else
            {
            for (int i  = 0;i< list.size();++i)
            {
                if (list.get(i).indexOf(str) == pos)
                    list.remove(list.get(i));
            }

        }
    }

    */



}
