import java.util.Scanner;

public class NumberGuess {
    public static final int SECRET_NUMBER = (int) (Math.random() * 100);
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Java NumberGuess");
        System.out.println("key in your guess: ");
        int num = sc.nextInt();
        guessNumber(num);
    }

    public static void guessNumber(int num) {
        int count = 1;
        while (num != SECRET_NUMBER) {
            if (num > SECRET_NUMBER) {
                System.out.println("Try lower");
            } else {
                System.out.println("Try higher");
            }
            num = sc.nextInt();
            count++;
        }
        System.out.printf("You got it in %d trials !", count);
    }
}
