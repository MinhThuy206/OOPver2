import java.util.Scanner;

public class TestPalindromicPhrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String str = sc.nextLine();
        String inStr = str.toLowerCase().replace(" ", "");

        if (check(inStr)) {
            System.out.printf("%s is a palindrome", str);
        } else {
            System.out.printf("%s is not palindrome", str);
        }
    }

    public static boolean check(String str) {
        int fIdx = 0;
        int bIdx = str.length() - 1;
        while (fIdx < bIdx) {
            if (str.charAt(fIdx) == str.charAt(bIdx)) {
                return true;
            }
            ++fIdx;
            --bIdx;
        }
        return false;
    }
}
