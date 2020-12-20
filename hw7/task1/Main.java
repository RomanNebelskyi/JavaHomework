package hw7.task1;

public class Main {
    public static void main(String[] args) {
        Payment payment = new WorkedFixed();
        WorkerHour payment1 = new WorkerHour(345, 6);

        System.out.println("Fixed per month " + payment.payment());
        System.out.println("Hour per month " + payment1.payment(2));
    }
}
