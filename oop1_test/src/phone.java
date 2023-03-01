import java.util.ArrayList;
import java.util.Scanner;

public class phone {
    Scanner sc = new Scanner(System.in);
    private int battery;
    String mess;
    String userName;

    public ArrayList<String> mail = new ArrayList<String>();
    public ArrayList<String> messSent = new ArrayList<String>();


    public phone(int battery) {
        this.battery = battery;
    }

    public phone(int battery, String userName) {
        this.battery = battery;
        this.userName = userName;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public void setMail(ArrayList<String> mail) {
        this.mail = mail;
    }

    public ArrayList<String> getMessSent() {
        return messSent;
    }

    public void setMessSent(ArrayList<String> messSent) {
        this.messSent = messSent;
    }

    public String messing(String mess,ArrayList<String> theMail) {
//        if (mess != null){
//            System.out.println(
//                    "Bạn có tin nhắn đang dở bạn có muốn viết tiếp ko ?" + "\n"
//                    + "(1). Có, cho tôi viết tiếp" + "\t\t\t\t" + "(2). Không, tôi muốn soạn tin mới"
//            );
//            int userOption = 0;
//            userOption = sc.nextInt();
//            if (userOption == 1){
//                String copyMess = mess;
//
//            }
//        }

        System.out.println("Hãy nhập tin nhắn...");
        String message = sc.nextLine();
        message = this.userName + ": " + message;
        return message;
    }
    public void sendMess(String message,ArrayList<String> theMail){
            theMail.add(message);
    }
    public void getMail(ArrayList<String> theMail) {
        for (String mess:
                theMail) {
            System.out.println(mess);
        }
    }

    public void displayMessSent(ArrayList<String> theMail) {
        for (String mess:
                theMail) {
            if (mess.indexOf(this.userName) == 0){
                System.out.println(mess);
            }
        }
    }

    public int descending(phone p){
        return p.battery - 1;
    }



}
