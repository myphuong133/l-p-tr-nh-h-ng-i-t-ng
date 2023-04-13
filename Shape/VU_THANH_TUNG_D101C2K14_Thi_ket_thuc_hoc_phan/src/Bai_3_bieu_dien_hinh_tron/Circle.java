package Bai_3_bieu_dien_hinh_tron;

public class Circle {
    private int x, y;
    private double radius;
    private String color;

    public Circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(int x, int y, double radius, String color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void render() {
        System.out.println("Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}'
        );
    }

    public double calArea() {
        return this.radius * radius * Math.PI;
    }

    public void display_x_y() {
        System.out.println("Toạ độ của hình tròn là : " + " x = " + this.x + " y = " + this.y);
    }
}



