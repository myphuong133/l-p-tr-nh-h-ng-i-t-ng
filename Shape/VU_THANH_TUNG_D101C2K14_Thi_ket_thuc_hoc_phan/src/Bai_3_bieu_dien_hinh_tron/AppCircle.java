package Bai_3_bieu_dien_hinh_tron;

public class AppCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(1, 2, 3, "Green");
        // Đổi màu
        circle1.setColor("Blue");
        circle2.setColor("Brown");
        // Hiển thị toạ độ
        circle1.display_x_y();
        circle2.display_x_y();
        // Hiển thị diện tích
        System.out.println("Diện tích hình 1:");
        System.out.println(circle1.calArea());
        System.out.println("Diện tích hình 2:");
        System.out.println(circle2.calArea());
        // Hiển thị thông tin
        circle1.render();
        circle2.render();

    }

}
