
package hw3;
import java.math.*;
public class Task3 {
    public static void main(String[] args) {
        int [][] arr= new int [5][7];
        fillArr(arr);
        outputArrInOpposite(arr);


    }

    static void fillArr(int [][]arr){
        for (int i = 0;i< arr.length;i++){
            for(int j = 0;j< arr[1].length;j++)
                arr[i][j]= (int) ( Math.random() * (75- (-2))+ (-2));
        }
    }

    static void outputArrInOpposite(int [][]arr){
        for (int i = 0;i< arr.length;i++){
            for(int j = 0;j< arr[1].length;j++)
                System.out.print(arr[i][j] + " ");
        }
        System.out.println("/n");
    }

}
