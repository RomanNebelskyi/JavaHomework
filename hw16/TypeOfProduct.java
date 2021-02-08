package hw16;

public enum TypeOfProduct
{
    DIARY(2),
    GROCERY(30),
    MEAT(3),
    DRINKS(50);
    private int maxExpDate;

    TypeOfProduct(int maxExpDate)
    {
        this.maxExpDate = maxExpDate;
    }
    public int getMaxExpDate(){return maxExpDate;}
}
