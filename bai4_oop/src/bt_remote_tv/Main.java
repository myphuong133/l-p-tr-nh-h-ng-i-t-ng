package bt_remote_tv;

public class Main {
    public static void main(String[] args) {
        TV tv1 = new TV(1,35,false);
        Remote rm = new Remote(tv1);

        System.out.println("Tình trạng bật tắt của TV: " + tv1.isOn());
        System.out.println("Kênh hiện tại: " + tv1.getChannel());
        System.out.println("Âm lượng: "  + tv1.getVolume());

        System.out.println("------------------------");
        tv1.setOn(true);
        System.out.println("Tình trạng bật tắt của TV: " + tv1.isOn());
        tv1.setChannel(7);
        System.out.println("Kênh hiện tại: " + tv1.getChannel());
        rm.changeChannel(3);
        System.out.println("Kênh hiện tại: " + tv1.getChannel());
        rm.changeVolumeUp(2);
        System.out.println("Âm lượng: "  + tv1.getVolume());
    }
}
