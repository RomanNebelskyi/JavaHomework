package hw2;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int []arr = new int[7];

        fillMas(arr);
        System.out.println("Sum is "+ findSumOfArr(arr));

    }
    static int fillMas(int []arr){

        Scanner newScan = new Scanner(System.in);

        for(int i = 0;i < arr.length ;i++){
            arr[i] = newScan.nextInt();
        }
        return 0;
    }
    static int findSumOfArr(int[]arr){
        int sum=0;
        for(int i = 0;i < arr.length ;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
