package hw14;

import java.util.*;

public class Main
{
    public static void main(String[] args) {

        TreeSet<Phone> set = new TreeSet<>();
        set.add(new Phone("jph", 3000, 20));
        set.add(new Phone("fsfdg", 4000, 10));
        set.add(new Phone("afse3q", 7000, 60));

        for (Phone ph:
             set) {
            System.out.print(ph.toString());
        }


        MyComparator myComparator = new MyComparator();
        SortedSet<Phone> buf = new TreeSet<>(myComparator);
        buf.addAll(set);


        for (Phone ph:
                buf) {
            System.out.print(ph.toString());
        }




    }
}
