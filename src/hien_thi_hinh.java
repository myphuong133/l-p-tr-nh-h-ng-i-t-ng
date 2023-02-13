public class hien_thi_hinh {
    public static void main(String[] args){
        String result = "";
        for (int i =1 ; i<= 5; i++){
            result = "";
            for (int j=6;j>i;j--){
                result += "*  ";
            }
            System.out.println(result);
        }

    }
}