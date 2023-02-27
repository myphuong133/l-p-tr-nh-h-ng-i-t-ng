
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class bt_gop_mang{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size,add_Index = 0,add_Element;
        int[] array_1 = {1,2,3,4,5} ;
        int[] array_2= {6,7,8,9,10};
        String result;
        //Copy mảng và in ra mảng thay thế
        ArrayList<Integer> resultArray = new ArrayList<>();
        for (int k =0; k< (array_1.length + array_2.length); k++){
            if (k < array_1.length){
                resultArray.add(array_1[k]);
            }
            
        }

        System.out.println(resultArray);

    }
}
