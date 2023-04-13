package Point;

public class Point_3D extends Point_2D {
    private float z;

    public Point_3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point_3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr = {super.getY(),super.getY(),this.getZ()};
        return arr;
    }
    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.setZ(z);
    }


    @Override
    public String toString() {
        return "( " + super.getX() + " , " + super.getY() +  " , " + this.getZ() + " )";
    }
}
