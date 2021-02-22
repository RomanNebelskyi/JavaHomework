package hometask;

import java.util.Comparator;

public class ComparatorByLength implements Comparator<Commondly>
{
    @Override
    public int compare(Commondly o1, Commondly o2)
    {
        return o1.getLength()>o2.getLength()? 1: (o1.getLength() == o2.getLength() ? 0: -1);
    }

}
