package bt_meo_chuot;

public class Main {
    public static void main(String[] args) {
        cat cat = new cat("Đạt",12,15);
        Rat rat = new Rat("bla",4,10,true);

        cat.eating(rat);
    }
}
