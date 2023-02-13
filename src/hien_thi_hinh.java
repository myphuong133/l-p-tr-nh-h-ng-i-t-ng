public class hien_thi_hinh {
    public static void main(String[] args){
        String result = "";
        int x = 1;
        for (int i =1 ; i<= 5; i++){
            result = "";
            for (int j=5;j>i;j--){
                result += "\t";
            }
            for (int k=0;k<x;k++){
                result += "  * ";
            }
            x += 2;
            System.out.println(result);
        }

    }
}