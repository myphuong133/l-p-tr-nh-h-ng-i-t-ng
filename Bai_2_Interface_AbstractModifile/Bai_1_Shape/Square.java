package Bai_2_Interface_AbstractModifile.Bai_1_Shape;

public class Square extends Rectangle{
    protected double side;

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    @Override
    public String toString() {
        return "Square[" +  super.toString()
                +']';
    }
}
