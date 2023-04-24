package Exception.BT_4;

public class Main {
    public static void main(String[] args) {
        try{
            throw new MyException("ádfadf");
        } catch (MyException e ){
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }
    }
}
