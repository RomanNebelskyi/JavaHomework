package hw2;

public class Task9 {
    public static void main(String[] args) {
        int rows= 6;
        int j = 1;
        for(int i = 1;i<=rows ; i++){
            for(int m = i ;m!=0 ;m--,j++ ){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
