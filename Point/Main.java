package Point;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Kiểm thử 2D
        Point_2D point2D_1 = new Point_2D();
        Point_2D point2D_2 = new Point_2D(3,4);

        float[] arr = new float[2];
        arr = point2D_2.getXY();

        System.out.println(Arrays.toString(arr));

        System.out.println(point2D_2);
        System.out.println(point2D_1);
        // Kiểm thử 3D

        Point_3D point3D = new Point_3D();
        Point_3D point3D_1 = new Point_3D(1,2,3);

        System.out.println(point3D);
        System.out.println(point3D_1);

    }
}
