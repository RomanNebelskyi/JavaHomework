package Soft.hw18;

public class RunnableThread implements Runnable {

    private long delayMs;
    private int quantityOfNums;



    public RunnableThread(long delayMs, int quantityOfNums)
    {
        this.delayMs = delayMs;
        this.quantityOfNums = quantityOfNums;
    }

    

    @Override
    public void run()
    {

        for (double i = quantityOfNums; i > -1  ; i++)
        {
            System.out.println(
                    (int) ( ( Math.pow( ( 1 +  Math.sqrt(5.0)) /2.0, i  ) - Math.pow(  (1 - Math.sqrt(5.0)) /2.0,i  ))/
                    (Math.sqrt(5.0) )));
            try
            {
                wait(delayMs);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }



}
