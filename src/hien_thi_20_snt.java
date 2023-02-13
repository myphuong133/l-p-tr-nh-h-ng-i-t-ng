import java.util.Scanner;

public class hien_thi_20_snt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng snt cần in");
        int number,count = 0,i,numberCheck = 0;
        number = sc.nextInt();
        boolean isNumberElement = false;
        String result = "";
        while (count < number){
            if (checkNumberElement(numberCheck)){
                System.out.println(numberCheck);
                result += numberCheck + ", ";
                count++;
            }
            numberCheck++;
        }

        System.out.println(result);


    }
    public static boolean checkNumberElement(int x){
        boolean isNumberElement = false;
        if (x==2){
            isNumberElement = true;
        }

        else {
            for (long i=2;i<Math.sqrt(x);i++){
                if (x%i == 0){
                    isNumberElement = false;
                }
                else {
                    isNumberElement = true;
                }
            }
        }
        return isNumberElement;
    }
}
