package Exception.BT1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bt_1 check = new Bt_1();
        try {
            System.out.print("Nhập vào cạnh thứ nhất: ");
            int a = sc.nextInt();
            System.out.print("Nhập vào cạnh thứ hai: ");
            int b = sc.nextInt();
            System.out.print("Nhập vào cạnh thứ ba: ");
            int c = sc.nextInt();

            try {
                check.checkTriangle(a,b,c);
            } catch (IllegalTriangleException e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e){
            System.out.println("Sai: không đúng định dạng" );
        }
    }
}
