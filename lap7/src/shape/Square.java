package shape;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
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
