package bai4_oop.StopWatch;

public class Watch {
    private int startTime,endTime;

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public long start(){
        return System.currentTimeMillis();
    }
    public long end(){
        return System.currentTimeMillis();
    }
    public double second(long t1, long t2){
        System.out.println(t1 + " / " + t2);
        return ((t2-t1));
    }


}
