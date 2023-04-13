package Bai_3_bieu_dien_hinh_tron;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(12, 2);
        Cylinder cylinder2 = new Cylinder(1);
        System.out.println(cylinder.tim_the_tich());
        System.out.println(cylinder2.tim_the_tich());
    }
}
