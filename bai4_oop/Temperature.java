package bai4_oop;

public class Temperature {
    public static void main(String[] args) {
        Temperature c = new Temperature(10);
        System.out.println(c.getC());
        System.out.println(c.changeToF());
        System.out.println(c.changeToKevin());
    }
    private double C;

    public double getC(){
        return this.C;
    }
    public void setC(double c){
        this.C = c;
    }

    public Temperature(double doC){
        this.C = doC;
    }

    public double changeToF(){
        return this.C*1.8 + 32;
    }
    public double changeToKevin(){
        return this.C + 273.15;
    }

}
