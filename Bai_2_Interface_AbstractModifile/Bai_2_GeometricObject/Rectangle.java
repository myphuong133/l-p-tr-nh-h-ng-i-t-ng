package Bai_2_Interface_AbstractModifile.Bai_2_GeometricObject;

public class Rectangle implements GeimetricObject{
    private double width,length;

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }
    @Override
    public double getPerimeter() {
        return (width+length)*2;
    }
}
