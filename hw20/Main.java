package Soft.hw20;

import jdk.dynalink.Operation;

public class Main
{
    public static void main(String[] args)
    {


      MyInterface findMax = (a,  c,  b)-> a>b? (a>c? a: c) : (b>c? b: c);
      MyInterface findAvg = ( a,  c,  b)->  (a+b+c)/3.0;
      MyInterface findSum = ( a,  c,  b)->  (a+b+c);


     // MyInterface findMax = (int a, int c, int b)-> a>b? (a>c? a: c) : (b>c? b: c);
        System.out.println(findMax.findValue(10,30,50));


    }

}
