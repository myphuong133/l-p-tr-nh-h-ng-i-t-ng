package Bai_3_bieu_dien_hinh_tron;

public class Cylinder extends Circle {
    private int height;

    public Cylinder(int height) {
        this.height = height;
    }

    public Cylinder(double radius, int height) {
        super(radius);
        this.height = height;
    }

    public double tim_the_tich() {
        return super.calArea() * height;
    }
}
