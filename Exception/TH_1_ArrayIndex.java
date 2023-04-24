package Exception;

import java.util.Random;
import java.util.Scanner;

public class TH_1_ArrayIndex {
    Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        for (int i = 0; i< 100;i++){
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + "");
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = Integer.parseInt(sc.nextLine());
            if ( 99%n == 0){
                System.out.println("Is a factor of 99");
            }
        } catch (ArithmeticException | NumberFormatException  ex){
            System.out.println("Arithemic " + ex);
        }
    }
}

