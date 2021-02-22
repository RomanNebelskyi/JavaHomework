package hw16;

public class Grocery extends Product
{
    public Grocery(String name, int price, int expAfterNDays) {
        super(name, price, TypeOfProduct.GROCERY, expAfterNDays);
    }
}
