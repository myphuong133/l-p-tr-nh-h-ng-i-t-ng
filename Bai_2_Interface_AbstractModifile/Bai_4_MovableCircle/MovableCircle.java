package Bai_2_Interface_AbstractModifile.Bai_4_MovableCircle;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        return "(" + center.x + "," + center.y + ")" + ", speed=(" + center.xSpeed + "," + center.ySpeed + " )" + ",Radius= " + this.radius;
    }

    @Override
    public void moveUp() {
        center.y = -center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y = +center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x = -center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x = +center.xSpeed;
    }
}
