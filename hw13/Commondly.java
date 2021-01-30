package hometask;

public class Commondly
{

    private String name;
    private int length;
    private int width;
    private int weight;


    public Commondly(String name, int length, int weight, int width) {
        this.name = name;
        this.length = length;
        this.weight = weight;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", weight=" + weight +"\n";
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
