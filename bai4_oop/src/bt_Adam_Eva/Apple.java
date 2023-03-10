package bt_Adam_Eva;

public class Apple {
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public Apple() {
        this.weight = 10;
    }
    public void decrease(){
        this.weight--;
    }
    public boolean isEmpty(){
        if(this.weight == 0){
            return true;
        }
        else {
            return false;
        }
    }

}
