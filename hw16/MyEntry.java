package hw16;

public class MyEntry <K, V extends Product >
{

    private K codeOfProduct;
    private V product;

    @Override
    public String toString() {
        return  "codeOfProduct=" + codeOfProduct +
                ", product=" + product ;
    }

    public K getCodeOfProduct() {
        return codeOfProduct;
    }

    public void setCodeOfProduct(K codeOfProduct) {
        this.codeOfProduct = codeOfProduct;
    }

    public V getProduct() {
        return product;
    }

    public void setProduct(V product) {
        this.product = product;
    }

    public MyEntry(K codeOfProduct, V product) {
        this.codeOfProduct = codeOfProduct;
        this.product = product;
    }
}
