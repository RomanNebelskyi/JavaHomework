package hw7.task2.second;

public class Main
{
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();

        System.out.println("2+3 = " + myCalculator.add(2,3));
        System.out.println("4-5 = " + myCalculator.deduct(5,4));
        System.out.println("6*7 = " + myCalculator.multiply(6,7));
        System.out.println("8/9 = " + myCalculator.divide(8,9));

    }
}
