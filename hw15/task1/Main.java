package hw15.task1;


import java.util.*;


public class Main {
    public static void main(String[] args) {


        Map<Person, List<Account>> globalUsers = new LinkedHashMap<>();


        globalUsers.put(new Person("Jason", 12), new ArrayList<>());
        globalUsers.put(new Person("Bil", 12), new LinkedList<>(Arrays.asList(new Account("example@gmail.com", "fghjk"), new Account("Bogas234", "ghjk"))));


        Scanner scanner = new Scanner(System.in);



        while (true) {
            System.out.println("Enter choice:\n" +
                    "1)Add a person\n" +
                    "2)Add an account\n" +
                    "3)Del the account of a pers\n" +
                    "4)Del a person\n" +
                    "5)Show all\n" +
                    "6)Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPerson(globalUsers);
                    break;
                case 2:
                    addAccountToPerson(globalUsers);
                    break;
                case 3:
                    delAccountForPerson(globalUsers);
                    break;
                case 4:
                    delPerson(globalUsers);
                    break;
                case 5:
                    showAll(globalUsers);
                    break;
                default:
                    return;
            }

        }
    }


    static void addPerson(Map<Person, List<Account>> map) {
        System.out.println("Enter name of a person");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Enter age of a person");
         int age = scanner.nextInt();
     if(age>0)
     {
         map.put(new Person(name, age), new ArrayList<>());
     }
     else {
         System.out.println("Wrong input!");
     }


    }

    static void addAccountToPerson(Map<Person, List<Account>> map) {

        System.out.println("Enter name of a person:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        Iterator<Person> myIter = map.keySet().iterator();

        while (myIter.hasNext()) {
            Person person = myIter.next();
            if (name.equalsIgnoreCase(person.getName())) {
                System.out.println("Enter login of a new acc:");
                String login = scanner.next();
                System.out.println("Enter password");
                String password = scanner.next();
                map.get(person).add(new Account(login, password));
                return;
            }
        }

            System.out.println("Wrong input!");



    }

    static void delAccountForPerson(Map<Person, List<Account>> map)
    {
        System.out.println("Enter name of a person:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Iterator<Person> myIter = map.keySet().iterator();


        while (myIter.hasNext()) {                  //iterator to find the person in our Map
            Person person = myIter.next();
            if (name.equalsIgnoreCase(person.getName())) { // actions if found
                int choice = 2;
                System.out.println("Which one you want to delete?\n" +
                        "1) Delete all");

                for (Account acc:               //to show all the accounts of a person
                     map.get(person)) {
                    if(acc.getLogin().length()!=0 && acc.getPassword().length()!=0) //to avoid empty fields
                    {
                        System.out.print(choice+") ");
                        System.out.print("Login: " + acc.getLogin());
                        System.out.print("      Pass: "  + acc.getPassword().replaceAll(".", "*") + "\n");
                        choice++;
                    }

                }

                choice = scanner.nextInt();
                switch (choice)
                {
                    case 1:
                        map.put(person, new ArrayList<>()); //deleting all accs
                        return;
                    default:
                        try {                   // if a user inputs the wrong choice
                           // map.put(person, new LinkedList<Account>(new LinkedList<>(map.get(person)).subList(choice, 3)));
                            map.get(person).remove(choice-2);
                        }
                        catch (IndexOutOfBoundsException  a )
                        {
                            System.out.println(  "\nWrong input!\n");

                        }
                        finally {
                            return;
                        }
                }

            }

        }


        System.out.println("\nWrong input!\n");

    }
    static void delPerson(Map<Person, List<Account>> map)
    {

        System.out.println("Enter name of a person you want to delete:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (Person pers:
             map.keySet())
        {
            if(pers.getName().equalsIgnoreCase(name))
            {
                map.remove(pers);
                return;
            }

        }
        System.out.println("\nWrong input!\n");



    }
    static void showAll(Map<Person, List<Account>> map)
    {
        for (Person pers:
                map.keySet() ) {

                separateTxt(20, '_');
                System.out.println(pers.toString());

                if(map.get(pers)!=null){
                    System.out.println(map.get(pers).toString().substring(1,map.get(pers).toString().length()-1));
                }


        }



    }
    static void separateTxt(int numOfSymbs, char symb)
    {
        while (numOfSymbs!=0)
        {
            System.out.print(symb);
            numOfSymbs--;
        }
        System.out.println();

    }





}
