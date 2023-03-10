package bt_meo_chuot;

public class Rat {
    private String name;
    private double weight,speed;

    private boolean isAlive;

    public Rat(String name, double weight, double speed, boolean isAlive) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
    public  void sounding(){
        System.out.println("Chit chit!");
    }
}
