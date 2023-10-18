package part1.point;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1,2,3);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
