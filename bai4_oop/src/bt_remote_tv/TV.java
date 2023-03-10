package bt_remote_tv;

public class TV {
    private int channel,volume;
    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
    public TV(int channel, int volume, boolean isOn) {
        this.channel = channel;
        this.volume = volume;
        this.isOn = isOn;
    }
    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
        this.volume = 35;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

}
