import java.util.Scanner;

public class tinh_so_ky_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "vu thanh tung";
        int count = 0;
        String input = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            String compair = String.valueOf(s.charAt(i));
            if (input.equals(compair)) {
                count++;
            }
        }
        System.out.println(s);
        System.out.println("Nhập chữ muốn tìm");
        System.out.println(count);
    }

}
