import java.util.Scanner;

public class th_tim_phan_tu {
    public static void main(String[] args){
        String[] students = {"khanh","đạt","quang"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name's student: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i=0;i< students.length; i++){
            if (students[i].equals(input_name)){
                System.out.println("vị của học sinh " + input_name + " là: " + i );
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not found " + input_name + "in the list.");
        }
    }
}
