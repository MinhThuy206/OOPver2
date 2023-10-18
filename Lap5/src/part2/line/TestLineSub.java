package part2.line;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub lineSub = new LineSub(1, 2, 3, 4);
        System.out.println(lineSub);
        System.out.println(lineSub.getLength());
        System.out.println(lineSub.getBeginX());
        System.out.println(lineSub.getGradient());

        lineSub.setBeginXY(4, 9);
        System.out.println(lineSub);

    }
}