import java.util.Arrays;
import java.util.Scanner;

public class tinh_tong_duong_cheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2D = new int[3][3];

        for (int i=0; i < arr2D.length; i++){
            for (int j=0;j<arr2D[i].length;j++){
                arr2D[i][j] = (int) (Math.random()*10 + 1);
            }
        }
        System.out.println(Arrays.deepToString(arr2D));
        int sum =0;

        for (int i=0; i < 3; i++){
            for ( int j=0;j<3;j++){
                if (i == j){
                    System.out.println(" " +i + j);
                    sum += arr2D[i][j];
                }
            }
        }
        System.out.println(sum);
    }

}
