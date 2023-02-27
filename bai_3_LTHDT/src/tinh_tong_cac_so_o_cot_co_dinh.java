import java.util.Arrays;
import java.util.Scanner;

public class tinh_tong_cac_so_o_cot_co_dinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2D = new int[3][3];

        for (int i=0; i < arr2D.length; i++){
            for (int j=0;j<arr2D[i].length;j++){
                arr2D[i][j] = (int) (Math.random()*10 + 1);
            }
        }
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println("Nhập cột bạn muốn tính");
        int col = sc.nextInt();
        int sumCol =0;
        for (int i=0; i < 3; i++){
            sumCol += arr2D[i][col];
        }
        System.out.println(sumCol);
    }

}
