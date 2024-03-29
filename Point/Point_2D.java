package Point;

public class Point_2D {
    private float x,y;

    public Point_2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public Point_2D(){

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }
    public float[] getXY(){
        float[] arrXY = {this.getX(),this.getY()};
        return arrXY;
    }

    @Override
    public String toString() {
        return "( " + x + " , " + y + " )";
    }
}
