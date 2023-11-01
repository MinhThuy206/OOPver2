package resizable;

import geometric.Circle;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle);

        ResizableCircle circle1 = new ResizableCircle(3.0);
        circle1.resize(50);
        System.out.println(circle1);
    }
}
