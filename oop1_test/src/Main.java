import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       phone nokia = new phone(100,"Tùng");
       phone samsung = new phone(100,"Quang");
       Scanner sc = new Scanner(System.in);
       int userPhone = 0;
       int phoneOption = 0;
       ArrayList<String> mail = new ArrayList<String>();
       int nokiaBattery = 100;
       int samsungBattery = 100;

       do {
           System.out.println("----------Lựa chọn điện thoại---------------");
           System.out.println("(1). Nokia  \t\t\t\t\t (2). Samsung " );
           userPhone = sc.nextInt();
           switch (userPhone){
               case 1:
                   String messingNokia= null;
                   do {
                       System.out.println("--------NOKIA--------");
                       System.out.println("\nNhập lựa chọn của bạn..." + "\n" +
                               "1. Soạn tin nhắn" + "\n" +
                               "2. Gửi tin nhắn" + "\n" +
                               "3. Xem hộp thư" + "\n" +
                               "4. Xem lại tin đã gửi" + "\n" +
                               "5. Kiểm tra tình trạng máy" + "\n" +
                               "6. Tắt điện thoại" + "\n" +
                               "7. Xạc pin" + "\n"
                       );
                       phoneOption = sc.nextInt();
                       switch (phoneOption){
                           case 1:
                               messingNokia = nokia.messing(messingNokia,mail);
                               nokia.descending(nokia);
                               nokiaBattery--;
                               break;
                           case 2:
                               samsung.sendMess(messingNokia,mail);
                               messingNokia = null;
                               samsung.getMail(mail);
                               nokia.descending(nokia);
                               nokiaBattery--;
                               break;
                           case 3:
                               samsung.getMail(mail);
                               nokia.descending(nokia);
                               nokiaBattery--;
                               break;
                           case 4:
                               System.out.println(nokia.getMessSent());
                               nokia.displayMessSent(mail);
                               nokia.descending(nokia);
                               nokiaBattery--;
                               break;
                           case 5:
                               System.out.println(nokiaBattery);
                               System.out.println("Tình trạng dang bật");
                               break;
                           case 6:
                               System.out.println("Đang tắt, vui lòng bật lại ở phần Option");
                               phoneOption = 0;
                           case 7:
                               if (nokiaBattery < 100){
                                   nokiaBattery+= 10;
                               }
                               else {
                                   System.out.println("Pin đã đầy");
                               }
                           break;
                       }
                   } while (phoneOption != 0);
                   break;
               case 2:
                   String mesingSamsung= null;
                   do {
                       System.out.println("--------SAMSUNG--------");
                       System.out.println("\nNhập lựa chọn của bạn..." + "\n" +
                               "1. Soạn tin nhắn" + "\n" +
                               "2. Gửi tin nhắn" + "\n" +
                               "3. Xem hộp thư" + "\n" +
                               "4. Xem lại tin đã gửi" + "\n" +
                               "5. Kiểm tra tình trạng máy" + "\n" +
                               "6. Bật, tắt điện thoại" + "\n" +
                               "7. Xạc pin" + "\n"
                       );
                       phoneOption = sc.nextInt();
                       switch (phoneOption){
                           case 1:
                               mesingSamsung = samsung.messing(mesingSamsung,mail);
                               samsungBattery--;
                               break;
                           case 2:
                               samsung.sendMess(mesingSamsung,mail);
                               mesingSamsung = null;
                               samsung.getMail(mail);
                               samsungBattery--;
                               break;
                           case 3:
                               samsung.getMail(mail);
                               samsungBattery--;
                               break;
                           case 4:
                               samsung.displayMessSent(mail);
                               samsungBattery--;
                               break;
                           case 5:
                               System.out.println(samsungBattery);
                               break;
                           case 6:
                               System.out.println("Đang tắt, vui lòng bật lại ở phần Option");
                               phoneOption = 0;
                            break;
                           case 7:
                               if (samsungBattery < 100){
                                   samsungBattery+= 10;
                               }
                               else {
                                   System.out.println("Pin đã đầy");
                               }
                               break;
                       }
                   } while (phoneOption != 0);
                   break;
           }
       }while (userPhone != 0);
    }
}