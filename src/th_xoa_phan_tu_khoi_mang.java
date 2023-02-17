import java.util.Scanner;
import java.util.Arrays;
public class th_xoa_phan_tu_khoi_mang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size,deleteIndex = 0,dlElement;
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
        inputArray = new int [size + 1];
        copyArray = new int[size];
        // Nhập mảng
        int i = 0;
        while (i<inputArray.length-1){
            System.out.println("Nhập giá trị tại vị trí: " + i);
            inputArray[i] = sc.nextInt();
            i++;
        }

        // Nhập và tìm số muốn xoá
        System.out.println("Nhập số muốn xoá");
        do {
            dlElement = sc.nextInt();
            for (int j = 0; j < inputArray.length - 1; j++) {
                if (inputArray[j] == dlElement) {
                    System.out.println("Đã thấy số" + dlElement + " tại " + j);
                    deleteIndex =j;
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                System.out.println("không tìm thấy số " + dlElement + " trong danh sách. Vui lòng nhập lại ");
            }
        } while (isExist == false);

        //Copy mảng và in ra mảng thay thế
        if (isExist){
            for (int k = 0; k< inputArray.length - 1; k++){
                if (k >= deleteIndex){
                    copyArray[k] = inputArray[k+1];
                    continue;
                }
                copyArray[k] = inputArray[k];
            }
        }
        result = Arrays.toString(copyArray);

        System.out.println("Mảng của bạn là");
        System.out.println(result);


    }
}
