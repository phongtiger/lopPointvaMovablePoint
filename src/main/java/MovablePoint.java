public class MovablePoint extends Point{
    private float XSpeed = 0.0f;
    private float YSpeed = 0.0f;

    public MovablePoint() {

    }
    public MovablePoint(float XSpeed, float YSpeed) {
        this.XSpeed = XSpeed;
        this.YSpeed = YSpeed;
    }
    public MovablePoint(float x,float y, float XSpeed, float YSpeed) {
        super(x,y);
        this.XSpeed = XSpeed;
        this.YSpeed = YSpeed;
    }

    public float getXSpeed() {
        return XSpeed;
    }

    public void setXSpeed(float XSpeed) {
        this.XSpeed = XSpeed;
    }

    public float getYSpeed() {
        return YSpeed;
    }

    public void setYSpeed(float YSpeed) {
        this.YSpeed = YSpeed;
    }

    public void setSpeed(float xSpeed,float ySpeed) {
        this.XSpeed = XSpeed;
        this.YSpeed = YSpeed;
    }
    public float[] getSpeed() {
        float[] arr = {getXSpeed(),getYSpeed()};
        return arr;
    }
    public String toString() {
        return "("+super.toString()+" speed = ("+getXSpeed()+","+getYSpeed()+")";
    }
    public void movePoint(float xSpeed,float ySpeed) {
        super.setX(getX()+xSpeed);
        super.setY(getY()+ySpeed);

    }
}

class Main {
    public static void main(String[] args) {
        Point point = new Point(1.5f,4.2f);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(1.7f,4f,6f,7f);
        System.out.println(movablePoint);
        movablePoint.movePoint(4.5f,6f);
        System.out.println(movablePoint);
    }
}
