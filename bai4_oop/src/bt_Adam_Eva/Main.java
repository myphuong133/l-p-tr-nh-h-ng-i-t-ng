package bt_Adam_Eva;

public class Main {
    public static void main(String[] args) {
        Apple apple_1 = new Apple();
        Apple apple_2 = new Apple();

        Human Adam = new Human("Adam",true,65);
        Human Eva = new Human("Eva",true,45);

        System.out.println(Adam.getWeight());
        Adam.eating(apple_1);
        Adam.eating(apple_1);
        Adam.eating(apple_1);
        Adam.eating(apple_1);
        Adam.eating(apple_1);
        Adam.eating(apple_1);
        Adam.eating(apple_1);
        Adam.eating(apple_1);
        Adam.eating(apple_1);
        Adam.eating(apple_1);
        Adam.eating(apple_1);
        Adam.eating(apple_1);
        Adam.eating(apple_1);
        Adam.eating(apple_1);
        Adam.eating(apple_1);
        System.out.println(Adam.getWeight());
        System.out.println(apple_1.getWeight());
        System.out.println(apple_2.getWeight());


    }
}
