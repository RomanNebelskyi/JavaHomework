package hometask;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Commondly>
{

    @Override
    public int compare(Commondly o1, Commondly o2)
    {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
