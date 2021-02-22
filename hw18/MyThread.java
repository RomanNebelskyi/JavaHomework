package Soft.hw18;

public class MyThread extends Thread {

    private long delayMs;
    private int quantityOfNums;



    public MyThread(long delayMs, int quantityOfNums)
    {
        this.delayMs = delayMs;
        this.quantityOfNums = quantityOfNums;
    }

    

    @Override
    public void run()
    {


    for (double i = 0; i < quantityOfNums  ; i++)
    {


        System.out.println(

                (int) ( ( Math.pow( ( 1 +  Math.sqrt(5.0)) /2.0, i  ) - Math.pow(  (1 - Math.sqrt(5.0)) /2.0,i  ))/
                (Math.sqrt(5.0) ))

        );


        try {
            sleep(delayMs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    }



}
