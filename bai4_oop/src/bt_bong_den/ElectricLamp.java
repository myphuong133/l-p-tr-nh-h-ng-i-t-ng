package bt_bong_den;

public class ElectricLamp {
    private String status;

    public String getStatus() {
        return status;
    }

    public ElectricLamp() {
        this.status = "Đang tắt";
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
