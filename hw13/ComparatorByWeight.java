package hometask;

import java.util.Comparator;

public class ComparatorByWeight implements Comparator<Commondly>
{
    @Override
    public int compare(Commondly o1, Commondly o2)
    {
        return o1.getWeight()>o2.getWeight()? 1: (o1.getWeight() == o2.getWeight() ? 0: -1);
    }
}
