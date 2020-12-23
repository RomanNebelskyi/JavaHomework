package hw8;

public class Functions {

    public static Months checkMonthExistence(String inString)
    {
        //о тут створювати
        for( Months months : Months.values())
        {
            if(inString.equalsIgnoreCase( months.name()))
                return months;
        }
        return null;
    }
    public static void findSameSeason(Months months)
    {
        for( int i = 0;i< Months.values().length;++i)
        {

            if(months.getSeasons().equals(Months.values()[i].getSeasons())
                    && !months.name().equals(Months.values()[i].name().toString()) )
            {
                System.out.println(Months.values()[i].name());
            }
        }

    }
    public static void findSameDays(Months months) {
        for (int i = 0; i < Months.values().length; ++i) {

            if (months.getDays() == (Months.values()[i].getDays())
                    && !months.name().equals(Months.values()[i].name().toString())) {
                System.out.println(Months.values()[i].name());
            }
        }
    }
    public static boolean findLessDays(Months months) {
        boolean checkExs= false;
        for (int i = 0; i < Months.values().length; ++i) {

            if (months.getDays() > (Months.values()[i].getDays())
                    && !months.name().equals(Months.values()[i].name().toString())) {
                System.out.println(Months.values()[i].name());
                checkExs = true;

            }
        }
        if(!checkExs)
            System.out.println("No months!");
        return false;
    }
    public static boolean findMoreDays(Months months) {
        boolean checkExs= false;
        for (int i = 0; i < Months.values().length; ++i) {

            if (months.getDays() < (Months.values()[i].getDays())
                    && !months.name().equals(Months.values()[i].name().toString())) {
                System.out.println(Months.values()[i].name());
                checkExs = true;

            }
        }
        if(!checkExs)
            System.out.println("No months!");
        return false;
    }

    public static Seasons findNextSeason(Months months)
    {




                if(months.getSeasons().equals(Months.values()[Months.values().length-1]))
                    System.out.println(Seasons.values()[0].toString());

               // return Seasons.values()[months.seasons.];
return null;



    }


}
