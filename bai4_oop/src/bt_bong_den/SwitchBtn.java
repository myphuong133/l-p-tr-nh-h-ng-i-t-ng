package bt_bong_den;

public class SwitchBtn {
    ElectricLamp electricLamp;
    private boolean isOn;

    public SwitchBtn(ElectricLamp electricLamp,boolean isOn) {
        this.electricLamp = electricLamp;
        this.isOn = isOn;
    }

    public void connetToLamp(ElectricLamp lamp){

    }
    public void turnOff(){
        this.electricLamp.setStatus("Đang tắt");
    }
    public void turnOn(){
        this.electricLamp.setStatus("Đang bật");
    }

}
