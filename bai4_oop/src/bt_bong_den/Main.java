package bt_bong_den;

public class Main {
    public static void main(String[] args) {
        ElectricLamp el = new ElectricLamp();
        SwitchBtn sBTn = new SwitchBtn(el,false);
       for (int i=0;i<5;i++){
           sBTn.turnOn();
           System.out.println(el.getStatus());
           sBTn.turnOff();
           System.out.println(el.getStatus());
       }

    }
}
