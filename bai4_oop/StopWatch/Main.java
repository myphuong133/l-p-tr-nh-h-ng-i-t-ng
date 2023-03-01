package bai4_oop.StopWatch;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Watch time = new Watch();
        long t1 = System.currentTimeMillis();
        long t4 = time.start();
        System.out.println(time.start());

        for (int i=0;i<100000;i++){
            System.out.println("ko");
        }
        long t2 = System.currentTimeMillis();
        long t5 = time.end();
        System.out.println(time.end());

        System.out.println((double) (t2-t1)/1000);
        System.out.println((double) (t5-t4)/1000);
        double t6 = time.second(t1,t2);
        System.out.println((double) t6);

    }
}
