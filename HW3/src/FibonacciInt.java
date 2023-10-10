public class FibonacciInt {
    public static void main(String[] args) {
        fibonacci();
    }

    public static void fibonacci() {
        int f0 = 0;
        int f1 = 1;
        int i = 1;
        System.out.println("F(0) = " + f0);
        System.out.println("F(1) = " + f1);

        while (Integer.MAX_VALUE - f1 > f0) {
            i++;
            f0 = f1 + f0;
            System.out.printf("F(%d) = %d\n",i, f0);
            i++;
            f1 = f1 + f0;
            System.out.printf("F(%d) = %d\n",i, f1);
        }
        System.out.printf("F(%d) is out of the range of int", i + 1);
    }
}
