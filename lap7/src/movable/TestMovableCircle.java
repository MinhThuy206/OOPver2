package movable;

public class TestMovableCircle {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(1,2,3,4,5);
        System.out.println(circle);
        circle.moveDown();
        System.out.println(circle);
        circle.moveRight();
        System.out.println(circle);
        circle.moveLeft();
        System.out.println(circle);
        circle.moveUp();
        System.out.println(circle);
    }
}
