package Bai_2_tim_so_lon_nhat;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] inputArray = inputArray();
        System.out.println("Phần tử có giá trị lớn nhất là: ");
        System.out.println(findMaxScore(inputArray));
    }
    // Hàm tìm số lớn nhất
    public static int findMaxScore(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i :
                inputArray) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }
    // Nhập mảng
    public static int[] inputArray() {
        // Nhập độ dài
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng số nguyên");
        int inputArrayLength = sc.nextInt();
        int[] inputArray = new int[inputArrayLength];
        int i = 0;
        while (i < inputArrayLength) {
            System.out.println("Nhập phần tử tại vị trí " + (i + 1));
            int inputValue = sc.nextInt();
            inputArray[i] = inputValue;
            i++;
        }
        System.out.println("Mảng bạn vừa tạo là: ");
        System.out.println(Arrays.toString(inputArray));
        return inputArray;
    }
}
