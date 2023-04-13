package Bai_1;

public class Tim_So_chan_le {
    public static void main(String[] args) {
        System.out.println(isOddEven(5));
        System.out.println(isOddEven(4));
    }
    // Phương thức tìm số chẵn
    public static boolean isOddEven(int inputValue) {
        if (inputValue % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
