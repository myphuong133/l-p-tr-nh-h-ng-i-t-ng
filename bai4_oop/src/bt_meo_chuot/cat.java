package bt_meo_chuot;

public class cat {
    private String name;
    private double weight,maxSpeed;

    Rat rat;

    public cat(String name, double weight, double maxSpeed) {
        this.name = name;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
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

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void sounding(){
        System.out.println("Meo meo!");
    }
    public boolean catchingRat(Rat rat){
        if (this.maxSpeed > rat.getSpeed()){
            return true;
        }
        else {
            return false;
        }
    }

    public void eating(Rat rat){
        if (rat.isAlive()){
            if (catchingRat(rat)){
                    this.weight+= rat.getWeight();
                    System.out.println("Đã ăn được chuột cân nặng hiện tại là: " + this.weight);
            }
            else{
                System.out.println("Có bắt được đâu mà ăn");
            }
        }
        else {
            System.out.println("Chê!");
        }
    }
}
