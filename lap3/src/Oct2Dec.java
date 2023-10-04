import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Octal string: ");
        String str = sc.next();
        System.out.printf("The equivalent decimal for binary '%s' is:  %d", str, octToDec(str));
    }

    public static int octToDec(String str) {
        int strLen = str.length();
        int sum = 0;
        for (int i = strLen - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            int digitValue = Character.getNumericValue(ch);
            sum += digitValue * Math.pow(8, strLen - i - 1);
        }
        return sum;
    }
}
