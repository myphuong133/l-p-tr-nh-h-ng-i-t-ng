package bt_remote_tv;

public class Remote {
    private TV tv;

    public Remote(TV tv) {
        this.tv = tv;
    }

    public void changeChannel(int channel){
        this.tv.setChannel(channel);
    }
    public void changeVolumeUp(int Volume){
        this.tv.setVolume(tv.getVolume() + Volume);
    }

    public void changeVolumeDown(int Volume){
        this.tv.setVolume(tv.getVolume() - Volume);
    }
}
