package hw9.task3;

import hw9.task3.first.Numerable;

public class MyCalculator implements Numerable
{


    public double myCl(int a, int b, char c) throws IllegalArgumentException, ArithmeticException, MyException
    {

        if(a<0 && b<0)
            throw new IllegalArgumentException("a<0 && b<0");
        if((a==0 && b!=0)|| (a!=0 && b==0) )
            throw new ArithmeticException("(a==0 && b!=0)|| (a!=0 && b==0)");
        if(a==0 && b==0)
            throw new IllegalArgumentException("a==0 && b==0");
        if(a>0 && b>0)
            throw new MyException("a>0&&b>0");

        switch (c){

            case '+':
                return (int) add(a,b) ;
            case '-':
                return (int) deduct(a,b);
            case '*':
                return (int) multiply(a,b);
            case '/':
                return divide(a,b);
            default:
                System.out.println("Wrong operation!");
                return -1;
        }



    }

    @Override
    public double divide(int a, int b) {
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
