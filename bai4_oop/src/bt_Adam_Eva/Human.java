package bt_Adam_Eva;

public class Human {
    private String name;
    private boolean isMale;

    private int weight;

    Apple apple;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Human(String name, boolean isMale, int weight) {
        this.name = name;
        this.isMale = isMale;
        this.weight = weight;
    }
    public void talk(String string){
        System.out.println(string);
    }
    public void eating(Apple apple){
        if (apple.getWeight() > 0){
            apple.decrease();
            this.weight++;
            System.out.println("Mút em ơi!");
        }
        else {
            System.out.println("Hết rồi!");
        }
    }
    public String checkApple(Apple apple){
        if (apple.getWeight() > 0){
            return "Ăn được";
        }
        else {
            return "Hết rồi";
        }
    }




}
