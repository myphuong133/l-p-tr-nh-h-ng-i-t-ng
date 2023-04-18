package Bai_2_Interface_AbstractModifile.Bai_1_Shape;

public class Circle extends Shape {
    protected double radius = 1.0;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return  "Circle[" + super.toString() +
                ",radius= " + radius +
                "]";
    }
}
