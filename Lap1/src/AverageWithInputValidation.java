import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUMSTUDENTS = 3;
        int numberIn;
        boolean isValid;
        int sum = 0;
        double average;

        for (int i = 1; i <= NUMSTUDENTS; i++) {
            isValid = false;
            do {
                System.out.print("Enter the mark (0-100) for student " + i + " : ");
                numberIn = sc.nextInt();
                if (numberIn > 0 & numberIn < 100) {
                    isValid = true;
                } else {
                    System.out.println("Invalid input, try again...");
                }
            } while (!isValid);
            sum += numberIn;
        }
        average = sum / NUMSTUDENTS;
        System.out.println("The average is: " + average);
    }
}
