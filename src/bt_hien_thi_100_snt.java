import java.util.Scanner;

public class bt_hien_thi_100_snt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Số snt dưới 100 là");
        int number,count = 0,i,numberCheck = 0;
        number = 25;
        boolean isNumberElement = false;
        String result = "";
        while (count < number){
            isNumberElement = checkNumberElement(numberCheck);
            if (isNumberElement){
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
            for (long i=2;i<x;i++){
                if (x%i == 0){
                    isNumberElement = false;
                    break;
                }
                else {
                    isNumberElement = true;
                }
            }
        }
        return isNumberElement;
    }
}

