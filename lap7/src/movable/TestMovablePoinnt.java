package movable;

public class TestMovablePoinnt {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1, 2, 3, 4);
        point.moveDown();
        System.out.println(point);
        point.moveUp();
        System.out.println(point);
        point.moveLeft();
        System.out.println(point);
        point.moveRight();
        System.out.println(point);
    }
}
