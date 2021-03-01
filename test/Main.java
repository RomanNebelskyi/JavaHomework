package test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args) {


        try {
            List<String> parse = Files.lines(Path.of("C:/Users/Roman/IdeaProjects/homework/src/test/input.txt")).collect(Collectors.toList());
            List<Device> myList = new ArrayList<>();

        if(parse.size()<=0)
        {
            System.out.println("Wrong file!");
            return;
        }


            for (int i = 0; i < parse.size(); i++)
            {
                String []buf = parse.get(i).split(", ");
                myList.add(new Device(Long.parseLong(buf[0]),buf[1], buf[2], Integer.parseInt(buf[3])));
            }


            System.out.println("1)out list\n2)find by serial\n3)sort by brand\n4)out price more 400\n5)has zero less 800\n6)the most precious");

            Scanner scanner =  new Scanner(System.in);


            int choice = 6;



            switch (choice)
            {
                case 1:
                    outList(myList);
                    break;
                case 2:
                    System.out.println(findSerial(myList));
                        break;
                case 3:
                sortByBrand(myList);
                    break;

                case 4:
            outMore400(myList);
                    break;

                case 5:
                outHasZeroLess800(myList);
                    break;

                case 6:
                    outTheMostPrecious(myList);
                   break;


                default:

                    System.out.println("wr input!");
                    break;

            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (DeviceNotFound deviceNotFound) {
            deviceNotFound.printStackTrace();
        }


    }


    static void outList(List<Device> list)
    {

        list.forEach(System.out::println);

    }

    static Device findSerial(List<Device> list) throws DeviceNotFound {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter serial");
        long serial =scanner.nextLong();

       return list.stream().filter(e->e.getSerialNumber()==serial).findFirst().orElseThrow(() -> new DeviceNotFound( "Serialnorfoind " +serial ));


    }


    static void sortByBrand(List<Device> list)
    {
         list = list.stream().sorted(new Comparator<Device>() {
            @Override
            public int compare(Device o1, Device o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        }).collect(Collectors.toList());


        System.out.println(list);

    }


    static void outMore400(List<Device> list)
    {
        System.out.println( list.stream().filter(e->e.getPrice()>=400).collect(Collectors.toList()).toString());
    }


    static void outHasZeroLess800(List<Device> list)
    {
        System.out.println(list.stream().filter(e->String.valueOf(e.getSerialNumber()).contains("0") && e.getPrice()<=800).collect(Collectors.toList()));
    }

    static void outTheMostPrecious(List<Device> list)
    {
        System.out.println(list.stream().reduce( 0, (s1, s2) -> s1 = s1> s2.getPrice()? s1: s2.getPrice(), (s1, s2) ->s1+s2));
    }

}
