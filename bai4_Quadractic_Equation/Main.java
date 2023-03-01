package bai4_Quadractic_Equation;

public class Main {
    public static void main(String[] args) {
        quadractic_equation q1 = new quadractic_equation(2,10,1);
        q1.getDiscriminant();
        System.out.println(q1.getRoot1());
        System.out.println(q1.getRoot2());
    }
}
