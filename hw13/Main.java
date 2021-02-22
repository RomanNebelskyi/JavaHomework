package hometask;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Main
{


    public static void main(String[] args)
    {

        LinkedList<Commondly> commondlyLinkedList = new LinkedList<>();
        commondlyLinkedList.add(new Commondly("Potatoe", 11,4,5));
        commondlyLinkedList.add(new Commondly("Onion", 61,7,8));
        commondlyLinkedList.add(new Commondly("Crab", 13,7,44));


        int choice = 1;
        Scanner scanner = new Scanner(System.in);



        while(choice>0 && choice<11)
        {
            System.out.println("Enter action:\n" +
                    "1)Add com\n" +
                    "2)Del com\n" +
                    "3)Change com\n" +
                    "4)Sort by name\n" +
                    "5)Sort by length\n" +
                    "6)Sort by width\n" +
                    "7)Sort by weight\n" +
                    "8)Get i-th element of the collection\n" +
                    "9) Output the whole collection\n"+
                    "10)Exit");
            choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    addElem(commondlyLinkedList, scanner);
                    break;
                case 2:
                    deleteElem(commondlyLinkedList, scanner);
                    break;
                case 3:
                    changeElement(commondlyLinkedList, scanner);
                    break;
                case 8:
                    outputIElement(commondlyLinkedList, scanner);
                    break;
                case 9:
                    outputAll(commondlyLinkedList);
                    break;
                case 10:
                    System.exit(1);
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    sortElems(commondlyLinkedList, scanner, choice);
                    break;
                default:
                    System.out.println("Wrong choice!");
                    break;
            }


        }
        return;
    }



    public static void addElem( LinkedList<Commondly> commondlyLinkedList, Scanner scanner)
    {
        System.out.println("Enter name of a product:");
        String name = scanner.next();
        System.out.println("Enter length:");
        int length = scanner.nextInt();
        System.out.println("Enter weight:");
        int weight = scanner.nextInt();
        System.out.println("Enter width");
        int width = scanner.nextInt();

        commondlyLinkedList.add(new Commondly(name, length, weight, width));

    }
    public static void deleteElem( LinkedList<Commondly> commondlyLinkedList, Scanner scanner)
    {
        if(commondlyLinkedList.size() == 0)
        {
            System.out.println("Cant delete anything!");
            return;
        }

        System.out.println("Enter index of an element:");
        int index = scanner.nextInt();

        if(index>=commondlyLinkedList.size())
        {
            System.out.println("Bad index!");
            return;
        }
        else
        {
            commondlyLinkedList.remove(index);
        }

    }
    public static void changeElement( LinkedList<Commondly> commondlyLinkedList  , Scanner scanner)
    {
        System.out.println("Enter index of an element you want to change:");
        int index = scanner.nextInt();

        if(index>=commondlyLinkedList.size())
        {
            System.out.println("Bad index!");
            return;
        }

        else
            {
                String name;
                System.out.println("Enter name of a product:");
                name = scanner.nextLine();
                System.out.println("Enter length:");
                int length = scanner.nextInt();
                System.out.println("Enter weight:");
                int weight = scanner.nextInt();
                System.out.println("Enter width");
                int width = scanner.nextInt();
                commondlyLinkedList.set(index, new Commondly(name, length, weight, width));
                return;
            }


    }
    public static void sortElems(LinkedList<Commondly> commondlyLinkedList  , Scanner scanner, int choice)
    {
        if (choice == 4)
        {
            commondlyLinkedList.sort(new ComparatorByName());
        }
        else if(choice == 5)
        {
            commondlyLinkedList.sort( new ComparatorByLength());
        }
        else if(choice == 6)
        {
            commondlyLinkedList.sort(new ComparatorByWidth());
        }
        else
        {
            commondlyLinkedList.sort(new ComparatorByWeight());
        }
        return;

    }
    public static void outputIElement(LinkedList<Commondly> commondlyLinkedList  , Scanner scanner)
    {
        System.out.println("Enter index of an element:");
        int index = scanner.nextInt();

        if(index>=commondlyLinkedList.size())
        {
            System.out.println("Bad index!");
            return;
        }
        else
            {
                System.out.println(commondlyLinkedList.get(index).toString());
            return;
        }

    }
    public static void outputAll(LinkedList<Commondly> commondlyLinkedList)
    {
        for (int i = 0; i < 26; i++) {
            System.out.print("_");
        }
        System.out.println();
        for (Commondly c:
             commondlyLinkedList) {
            System.out.print(c.toString());
        }
        

    }

}
