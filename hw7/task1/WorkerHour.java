package hw7.task1;

public class WorkerHour implements Payment
{

    private int salaryPerHour = 340;
    private int workDays = 5;

    public WorkerHour(int salaryPerHour, int workDays) {
        this.salaryPerHour = salaryPerHour;
        this.workDays = workDays;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    @Override
    public int payment() {
        return -1;
    }

    public int payment(int hours)
    {
        return hours*salaryPerHour*workDays;
     }


    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public WorkerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
    public WorkerHour()
    {
        this.salaryPerHour = getSalaryPerHour();
    }
}
