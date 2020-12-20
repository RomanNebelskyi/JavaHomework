package hw7.task2.second;

import hw7.task2.first.Numerable;

public class MyCalculator implements Numerable
{
    @Override
    public double divide(int a, int b) {
        if(b==0){
            System.out.println("Cant divide by zero");
            return -1;
        }
        else
            return (double) a/b;

    }

    @Override
    public int deduct(int a, int b) {
        return a-b;
    }

    @Override
    public int multiply(int a, int b) {
        return a*b;
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
