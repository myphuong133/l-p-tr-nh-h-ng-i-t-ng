package Shape;

public class Triangle extends Shape{
    private double side1 = 1,side2 = 1,side3 = 1;

    public Triangle() {
    }

    public Triangle(float side1, float side2, float side3) {
        if ((side1 + side2) < side3){
            System.out.println("Không thành công");
            return;
        }
        if ((side2 + side3) < side1){
            System.out.println("Không thành công");
            return;
        }
        if ((side1 + side3) < side2){
            System.out.println("Không thành công");
            return;
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }

    public double getArea(){
        double p = this.getPerimeter()/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
