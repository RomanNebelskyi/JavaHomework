package hw8;

public enum Months
{
    JAN(31, Seasons.WINTER),
    FEB(28, Seasons.WINTER),
    MAR(31, Seasons.SPRING),
    APR(30, Seasons.SPRING),
    MAY(31, Seasons.SPRING),
    JUN(30, Seasons.SUMMER),
    JUL(31, Seasons.SUMMER),
    AUG(30, Seasons.SUMMER),
    SEP(31, Seasons.AUTUMN),
    OCT(30, Seasons.AUTUMN),
    NOV(31, Seasons.AUTUMN),
    DEC(30, Seasons.WINTER);

    int days;
    Seasons seasons;

    public int getDays() {
        return days;
    }

    public Seasons getSeasons() {
        return seasons;
    }

    Months() {
    }

    Months(int days, Seasons seasons)
    {
        this.days = days;
        this.seasons = seasons;
    }






}
