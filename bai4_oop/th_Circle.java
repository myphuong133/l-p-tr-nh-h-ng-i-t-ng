package bai4_oop;

public class th_Circle {
    private int radius;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        this.radius = r;
    }

    public th_Circle() {
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }


}
