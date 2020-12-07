package hw3;

public class Task1 {

    public static void main(String[] args) {

        int m = 5;
        int k  = 3;
        int money = 300;
        for(;k!=0 ;k--){
           money = money + (int) (money *(m/100.0f));
        }

        System.out.println("Money  : "+ money);

    }
}
