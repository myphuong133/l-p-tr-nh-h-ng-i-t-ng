package bai4_oop.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,10,true,"Yellow");
        Fan fan2 = new Fan(2,5,false,"Blue");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
