
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class bt_them_phan_tu_vao_mang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size,add_Index = 0,add_Element;
        int[] inputArray,copyArray;
        String result;
        boolean isExist = false;

        //Không cho mảng vượt quá 10 phần tử vì thích thế
        System.out.println("Nhập độ dài mảng không quá 10");
        do {
            size = sc.nextInt();
            if (size > 10){
                System.out.println("Ko thích làm hơn 10 số");
            }
        }
        while (size > 10);
        inputArray = new int [size];
        copyArray = new int[size];
        // Nhập mảng
        int i = 0;
        while (i<inputArray.length){
            int a = i + 1;
            System.out.println("Nhập giá trị tại vị trí: " + a);
            inputArray[i] = sc.nextInt();
            i++;
        }

        // Nhập và kiểm tra số muốn thêm
        System.out.println("Nhập số muốn thêm");
        add_Element = sc.nextInt();
        System.out.println("Nhập vị trí muốn chèn");
        do {
            add_Index = sc.nextInt();
            if (add_Index  < 0){
                System.out.println("Vị trí phải là số dương vui lòng nhập lại");
            }
            else if (add_Index > inputArray.length ) {
                System.out.println("Vị trí nhập quá cao so với đọ dài tối đa mời nhập lại");
            }
        } while (add_Index  < 0 || add_Index > inputArray.length );

        //Copy mảng và in ra mảng thay thế
        ArrayList<Integer> resultArray = new ArrayList<>();
        for (int k =0; k< inputArray.length; k++){
            resultArray.add(k,inputArray[k]);
        }
        resultArray.add(add_Index-1,add_Element);
       System.out.println(resultArray);

    }
}
