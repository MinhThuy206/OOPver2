package part1.shape;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled, size, size);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double size) {
        setLength(size);
        setWidth(size);
    }

    @Override
    public void setWidth(double size) {
        super.setWidth(size);
        super.setLength(size);
    }

    @Override
    public void setLength(double size) {
        super.setLength(size);
        super.setWidth(size);
    }

    @Override
    public String toString() {
        return "Square{" + super.toString() + "}";
    }
}
