package hw2;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int []arr = new int[7];
        fillMas(arr);
      fillNewArr(arr);
    }

    static int fillMas(int []arr){

        Scanner newScan = new Scanner(System.in);

        for(int i = 0;i < arr.length ;i++){
            arr[i] = newScan.nextInt();
        }
        return 0;
    }
    static int outputArray(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.println( arr[i]);
        }
        return 0;
    }
    static int findNumOfPos(int []arr){
        int pos=0;
        for(int i  = 0 ;i< arr.length;i++){
            if(0 < arr[i]){
                pos++;
            }
        }
        return pos;
    }
    static int findNumOfNegs(int []arr){
        int negs=0;
        for(int i  = 0 ;i< arr.length;i++){
            if(0 > arr[i]){
                negs++;
            }
        }
        return negs;
    }
    static int fillNewArr(int []arr){

        int negs = findNumOfNegs(arr);
        int pos = findNumOfPos(arr);
        int []arrNegs = new int[negs];
        int []arrPos = new int[pos];
        for (int i = 0;i<arr.length;i++){
            if(arr[i]< 0 ){
                arrNegs[negs-1]=arr[i];
                negs--;
            }
            else if (arr[i]>0) {
                arrPos[pos-1] = arr[i];
                pos--;
            }
        }
        System.out.println("Negs are: ");
        outputArray(arrNegs);
        System.out.println("Pos are: ");
        outputArray(arrPos);
        return 0;
    }
}
