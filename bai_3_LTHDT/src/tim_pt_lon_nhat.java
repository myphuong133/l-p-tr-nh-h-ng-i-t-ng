import java.util.Arrays;

public class tim_pt_lon_nhat {
    public static void main(String[] args) {
        int[][] arr2D = new int[3][3];

        for (int i=0; i < arr2D.length; i++){
            for (int j=0;j<arr2D[i].length;j++){
                arr2D[i][j] = (int) (Math.random()*10 + 1);
            }
        }
        System.out.println(Arrays.deepToString(arr2D));
        int max = arr2D[0][0];
        for (int i=0; i < arr2D.length; i++){
            for (int j=0;j<arr2D[i].length;j++){
                if (max < arr2D[i][j]){
                    max = arr2D[i][j];
                }
            }
        }
        System.out.println(max);
    }

}
