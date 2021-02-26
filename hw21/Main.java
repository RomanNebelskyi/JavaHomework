package Soft.hw21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        List<Person> people = new ArrayList<>();
        people.add(new Person("Jason", 12, "male"));
        people.add(new Person("Lily", 25, "female"));
        people.add(new Person("Albert", 27, "male"));
        people.add(new Person("Josh", 20, "male"));
        people.add(new Person("Josh", 20, "female"));
        people.add(new Person("Fil", 2, "male"));
        people.add(new Person("Mary", 58, "female"));



        System.out.println(armyList(people));

        System.out.println(avgAge(people));

        System.out.println(findWorkingPeople(people));

        System.out.println(sortInReverse(people));

        System.out.println(fullSort(people));

        System.out.println(findTheOldest(people));

        System.out.println(findTheYoungest(people));

        System.out.println(findNumOfMales(people));

        System.out.println(findNumOfFemales(people));

        System.out.println(findALetterFemales(people));

        System.out.println();

    }

    static List<Person> armyList(List<Person> people) {
        return people.stream()
                .filter(person -> "male".equalsIgnoreCase(person.getSex()))
                .filter(e -> e.getAge() >= 18 && e.getAge() <= 27)
                .collect(Collectors.toList());
    }

    static double avgAge(List<Person> list) {

        Stream<Person> personStream = list.stream().filter(person -> "male".equalsIgnoreCase(person.getSex()));

        return personStream.reduce(0, (x, y) ->
        {
            x += y.getAge();
            return x;
        }, (x, y) -> x + y) / (double) list.size();
    }

    static List<Person> findWorkingPeople(List<Person> list) {
        return list.stream()
                .filter(person -> "male".equalsIgnoreCase(person.getSex()) && person.getAge() >= 18 && person.getAge() <= 60)
                .filter(person -> "female".equalsIgnoreCase(person.getSex()) && person.getAge() >= 18 && person.getAge() <= 55).collect(Collectors.toList());

    }

    static List<Person> sortInReverse(List<Person> list) {
        return list.stream().sorted(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getName().compareTo(o1.getName());
            }
        }).collect(Collectors.toList());
    }

    static List<Person> fullSort(List<Person> list)
    {
        return list.stream().sorted(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getName().compareTo(o2.getName()) == 0 )
                {
                    return Integer.compare(o1.getAge(), o2.getAge());
                }
                else
                    return o1.getName().compareTo(o2.getName());
            }
        }).collect(Collectors.toList());
    }
    static Person findTheOldest(List<Person> list)
    {
        return list.stream().reduce((a1, a2) -> a1 = a1.getAge() > a2.getAge() ? a1: a2 ).orElse(new Person(null, 0, null));
    }
    static Person findTheYoungest(List<Person> list)
    {
        return list.stream().reduce((a1, a2) -> a1 = a1.getAge() > a2.getAge() ? a2: a1 ).orElse(new Person(null, 0, null));
    }
    static long findNumOfMales(List<Person> list)
    {
        return list.stream().filter(person -> "male".equalsIgnoreCase(person.getSex())).count();
    }
    static long findNumOfFemales(List<Person> list)
    {
        return list.stream().filter(person -> "female".equalsIgnoreCase(person.getSex())).count();
    }
    static long findALetterFemales(List<Person> list)
    {
        return list.stream().filter(person -> "female".equalsIgnoreCase(person.getSex())).filter(person -> person.getName().startsWith("A")).count();
    }

}
