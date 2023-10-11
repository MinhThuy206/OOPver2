package ex2.mypoint;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int getEndX() {
        return begin.getX();
    }

    public void setEndX(int x) {
        begin.setX(x);
    }

    public int getEndY() {
        return begin.getY();
    }

    public void setEndY(int y) {
        begin.setY(y);
    }

    public int[] getBeginXY() {
        return begin.getXY();
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public int[] getEndXY() {
        return end.getXY();
    }

    public void setEndXY(int x, int y) {
        end.setXY(x,y);
    }

    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient() {
        int yDiff = end.getY() - begin.getY();
        int xDiff = end.getX() - begin.getX();
        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return "MyLine[begin=(" + begin.getX() + "," + begin.getY() + "), end=(" + end.getX() + "," + end.getY() + ")]";
    }


}
