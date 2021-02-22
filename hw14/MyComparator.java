package hw14;

import java.util.Comparator;

public class MyComparator implements Comparator<Phone>
{


    @Override
    public int compare(Phone o1, Phone o2) {


        if(o1.getModel().equalsIgnoreCase(o2.getModel()))
        {
            return o1.getCamera()>o2.getCamera()? 1:(o1.getCamera()<o2.getCamera() ? -1:0);
        }
        return o1.getModel().compareTo(o2.getModel());
    }
}
