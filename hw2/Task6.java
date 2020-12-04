package hw2;
import java.util.Scanner;

public class Task6 {



    public static void main(String[] args) {

        int []arr = new int[7];

        fillMas(arr);

        findMaxAndMin(arr);


    }

    static int fillMas(int []arr){

        Scanner newScan = new Scanner(System.in);

        for(int i = 0;i < arr.length ;i++){
            arr[i] = newScan.nextInt();
        }

        return 0;
    }
    static int findMaxAndMin(int []arr){

       int max= arr[arr.length-1];
         int min = arr[0];

        for(int i = 0;i< arr.length;i++){
            if(arr[i]> max){
                max=arr[i];
            }
            if(arr[arr.length-i-1]<min){
                min=arr[arr.length-i-1];
            }
        }

        if(min>max){
            min = min + max;
             max = min-max;
             min= min-max;
        }
        System.out.println("Max is "+max+ ";\nMin is " + min);
        return 0;
    }
}
