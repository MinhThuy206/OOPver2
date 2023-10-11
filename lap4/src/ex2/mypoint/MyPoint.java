package ex2.mypoint;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] point = new int[2];
        point[0] = getX();
        point[1] = getY();
        return point;
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(MyPoint anotherPoint) {
        return Math.sqrt(Math.pow((this.x - anotherPoint.getX()), 2)
                + Math.pow((this.y - anotherPoint.getY()), 2));
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
}
