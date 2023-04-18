package Bai_2_Interface_AbstractModifile.Bai_3_Movable;

public class MovablePoint implements Movable{
    int x,y,xSpeed,ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "( " + x + "," + y + ")" + "speed( " + xSpeed + "," + ySpeed + " )";
    }
    @Override
    public void moveUp() {
        y = -ySpeed;
    }

    @Override
    public void moveDown() {
        y = + ySpeed;
    }

    @Override
    public void moveLeft() {
        x = -xSpeed;
    }

    @Override
    public void moveRight() {
        x = +xSpeed;
    }
}
