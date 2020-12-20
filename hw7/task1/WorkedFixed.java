package hw7.task1;

public class WorkedFixed implements Payment
{
    int salatyPerMonth = 30000;

    public int getSalatyPerMonth() {
        return salatyPerMonth;
    }

    public void setSalatyPerMonth(int salatyPerMonth) {
        this.salatyPerMonth = salatyPerMonth;
    }

    public WorkedFixed()
    {
        this.salatyPerMonth = getSalatyPerMonth();
    }
    public WorkedFixed(int salatyPerMonth) {
        this.salatyPerMonth = salatyPerMonth;
    }

    @Override
    public int payment() {
        return salatyPerMonth;
    }




}
