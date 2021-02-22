package hw16;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Магазин має свої ключі, які позначають товар на складі ( 1, 2, 3...). Але кожен товар має і власний код продукту. Код може бути не унікальний.
        //Кожен тип товару має максимальну кількіть днів зберігання. Після цього товар видаляється з магазину, проте деякі продукти можуть зберігатись
        // менше, ніж макс. к-сть днів.


        Map<String, MyEntry<Integer, Product>> myShop = new LinkedHashMap<>();
        myShop.put("1", new MyEntry<>(1245, new Diary("Milk", 300, 1)));
        myShop.put("2", new MyEntry<>(1675, new Drinks("Cola", 32, 15)));
        myShop.put("3", new MyEntry<>(15, new Grocery("Rice", 123, 25)));
        myShop.put("4", new MyEntry<>(175, new Meat("Beef", 400, 2)));
        myShop.put("5", new MyEntry<>(165, new Diary("Cheese", 40, 2)));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter choice : \n" +
                "1)Add new product to a map\n" +
                "2)Del a prod by the key\n" +
                "3)Del a prod by the value\n" +
                "4)Output set of keys\n" +
                "5)Output list of values\n" +
                "6)Output the whole map\n");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addElement(myShop);
                break;
            case 2:
                delElementByKey(myShop);
                break;
            case 3:
                delElemetByValue(myShop);
                break;
            case 4:
                outSetOfKeys(myShop);
                break;
            case 5:
                outListOfValues(myShop);
                break;
            case 6:
                outMap(myShop);
                break;
        }

    }

    public static void addElement(Map<String, MyEntry<Integer, Product>> myShop) {
        System.out.println("Enter a special key(if it already exists, we*ll warn you so you can change it)\n");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.next();

        if (myShop.containsKey(key)) {

            System.out.println("The object already exists. Want to change it?\n" +
                    "1) YEs\n" +
                    "2)No");
            int choice = scanner.nextInt();
            if (choice == 1) {
                addingNewValueToMap(key, myShop);

            } else {
                System.out.println("Cancelling the action.");
                return;
            }

        } else {
            System.out.println("The shop doesnt have the same product. Creating new one.\n");
            addingNewValueToMap(key, myShop);

        }

    }

    public static void addingNewValueToMap(String key, Map<String, MyEntry<Integer, Product>> myShop) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        System.out.println("Enter code of a product:");
        int codeOfProduct = scanner.nextInt();
        System.out.println("Enter type of a product:");
        for (TypeOfProduct type :
                TypeOfProduct.values()) {
            System.out.println(choice + ")" + type + "\n");
        }
        System.out.println("Enter name of a product:");
        String name = scanner.next();
        System.out.println("Enter price:");
        int price = scanner.nextInt();
        System.out.println("Enter expiration date of a product( it should be less than " + myShop.get(key).getProduct().getExpAfterNDays() + " days");
        int newExpirationDate = scanner.nextInt();

        switch (choice) {
            case 1:
                myShop.put(key, new MyEntry<>(codeOfProduct, new Diary(name, price, newExpirationDate)));
                break;
            case 2:
                myShop.put(key, new MyEntry<>(codeOfProduct, new Grocery(name, price, newExpirationDate)));
                break;
            case 3:
                myShop.put(key, new MyEntry<>(codeOfProduct, new Meat(name, price, newExpirationDate)));
                break;
            case 4:
                myShop.put(key, new MyEntry<>(codeOfProduct, new Drinks(name, price, newExpirationDate)));
                break;
            default:
                System.out.println("Wrong choice!");
                return;
        }


    }

    public static void delElementByKey(Map<String, MyEntry<Integer, Product>> myShop) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a key of the obj you want to delete:");
        outMap(myShop);
        String key = scanner.next();

        if (myShop.containsKey(key))
            myShop.remove(key);
        else
            System.out.println("Cant perform an action. Wrong key!");
    }

    public static void delElemetByValue(Map<String, MyEntry<Integer, Product>> myShop)
    {

        System.out.println("Enter code of a product you want to delete");
        outMap(myShop);
        Scanner scanner = new Scanner(System.in);
        int codeOfProd = scanner.nextInt();
        System.out.println("Enter name of a product you want to delete:");
        String name = scanner.next();



        for ( MyEntry<?, ?> entry :
             myShop.values()) {

            if (name.equalsIgnoreCase(entry.getProduct().getName()) && codeOfProd == (int) entry.getCodeOfProduct()) {
                for (String str :
                        myShop.keySet()) {

                    if (myShop.get(str).getProduct().getName() == entry.getProduct().getName() && myShop.get(str).getCodeOfProduct() == codeOfProd) {
                        myShop.remove(str);
                        return;
                    }

                }

            }

        }
        System.out.println("Wrong value!");
    }

    public static void outSetOfKeys(Map<String, MyEntry<Integer, Product> > myShop)
    {

        for (String buf:
             myShop.keySet()) {
            System.out.println("Key is : " + buf);
        }


    }

    public static void outListOfValues(Map<String, MyEntry<Integer, Product> > myShop)
    {

        for (String str:
             myShop.keySet()) {
            System.out.println(myShop.get(str).toString());
        }

    }

    public static void outMap(Map<String, MyEntry<Integer, Product> > myShop)
    {
        for (String buf :
             myShop.keySet()) {
            System.out.println("Key is :" + buf + ", value: "+ myShop.get(buf).toString());
        }



    }


}





