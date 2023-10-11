package ex2.mypoint;

public class TestMyPoints {
    public static void main(String[] args) {
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i, i);
        }
        for (MyPoint i : points) {
            System.out.println(i);
        }
    }
}
