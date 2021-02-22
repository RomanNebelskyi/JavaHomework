package hw16;

public class Product
{
    private String name;
    private int price;
    private TypeOfProduct typeOfProduct;
    private int expAfterNDays;

    public Product(String name, int price, TypeOfProduct typeOfProduct, int expAfterNDays) {
        this.name = name;
        this.price = price;
        this.typeOfProduct = typeOfProduct;
        this.expAfterNDays = typeOfProduct.getMaxExpDate();
        setExpAfterNDays(expAfterNDays);
    }

    public int getExpAfterNDays() {
        return expAfterNDays;
    }

    public void setExpAfterNDays(int expAfterNDays) {
        if(expAfterNDays > this.expAfterNDays)
        {
            System.out.println("Wrong Expiration date!");
            return;
        }
        else
            this.expAfterNDays = expAfterNDays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public TypeOfProduct getTypeOfProduct() {
        return typeOfProduct;
    }

    public void setTypeOfProduct(TypeOfProduct typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "name = '" + name + '\'' +
                ", price = " + price +
                ", typeOfProduct = " + typeOfProduct +
                ", expAfterNDays = " + expAfterNDays +
                '}';
    }
}
