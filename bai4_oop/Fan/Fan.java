package bai4_oop.Fan;

public class Fan {
    public final int Slow = 1,Medium = 2,Fast = 3;
    private int speed ,radius;
    private boolean isOn;

    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRadius() {
        return radius;
    }



    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(int speed, int radius, boolean isOn, String color) {
        this.speed = speed;
        this.radius = radius;
        this.isOn = isOn;
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn){
            return "Quạt{" +
                    "Tốc độ= " + speed +
                    ", Bán kính= " + radius +
                    ", Quạt đang bật" +
                    ", Màu= " + color + '\'' +
                    '}';
        }
        else {
            return "Quạt{" +
                    "Tốc độ= " + speed +
                    ", Bán kính= " + radius +
                    ", Quạt đang tắt" +
                    ", Màu= " + color + '\'' +
                    '}';
        }
    }
}
