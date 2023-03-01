package bai4_oop;

public class th_hinh_chu_nhat {
    public static void main(String[] args) {
        th_hinh_chu_nhat rec = new th_hinh_chu_nhat(3,5);
        th_hinh_chu_nhat rec2 = new th_hinh_chu_nhat(10,15);
        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());
        rec.display();
        rec2.display();
    }
    private int width,height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public th_hinh_chu_nhat(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (width+height)*2;
    }

    public void display(){
        System.out.println("Hình chữ nhật này có chiều rộng: " + width + " chiều cao: " + height);
    }
}
