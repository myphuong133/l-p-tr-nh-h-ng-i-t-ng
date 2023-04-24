package Exception.BT1;

public class Bt_1 {
    public void checkTriangle(double a,double b, double c) throws IllegalTriangleException{
        if (a + b <= c || a + c <= b || b + c <= a ){
            throw new IllegalTriangleException("Không phải là tam giác");
        }
        else {
            System.out.println("Tam giác hợp lệ");
        }
    }
}
