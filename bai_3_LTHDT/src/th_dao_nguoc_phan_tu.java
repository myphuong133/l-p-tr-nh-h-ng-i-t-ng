import java.util.Arrays;
import java.util.Scanner;
public class th_dao_nguoc_phan_tu {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int size = 6;
        int[] array ;
        int i = 0;
        array = new int[size];
        while (i < array.length){
            System.out.println("Nhập phần tử tại vị trí " + (i+1) + ": " );
            array[i] = sc.nextInt();
            i++;
        }
        System.out.printf(Arrays.toString(array));

        for (int j=0;j<array.length/2;j++){
            int x = array[j];
            array[j] = array[array.length-j-1];
            array[array.length-j-1] = x;
        }
        System.out.printf(Arrays.toString(array));


    }

}
