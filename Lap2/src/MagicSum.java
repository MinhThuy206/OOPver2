import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        final int SENTINEL = -1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer (or -1 to end): ");
        int number = sc.nextInt();
        int sum = 0;
        while (number != SENTINEL) {
            if (hasEight(number)) {
                sum += number;
            }
            System.out.print("Enter the positive integer (or -1 to end): ");
            number = sc.nextInt();
        }
        System.out.println("The magic sum is: " + sum);
    }

    public static boolean hasEight(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit == 8) {
                return true;
            }
            number = number / 10;
        }
        return false;

    }
}
