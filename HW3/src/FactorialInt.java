public class FactorialInt {
    public static void main(String[] args) {
        factorialLong();
    }

    public static void factorialInt() {
        int factorial = 1;
        int n = 0;
        while (Integer.MAX_VALUE / factorial > n + 1) {
            n++;
            factorial *= n;
            System.out.printf("The factorial of %d is %d\n", n, factorial);
        }
        System.out.printf("The factorial of %d is out of range ", (n + 1));
    }

    public static void factorialLong() {
        long factorial = 1;
        int n = 0;
        while (Long.MAX_VALUE / factorial > n + 1) {
            n++;
            factorial *= n;
            System.out.printf("The factorial of %d is %d\n", n, factorial);
        }
        System.out.printf("The factorial of %d is out of range ", (n + 1));
    }

}