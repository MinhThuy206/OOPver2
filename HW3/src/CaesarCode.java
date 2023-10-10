import java.util.Locale;
import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the plaintext string: ");
        String str = in.next().toUpperCase(Locale.ROOT);
        System.out.println("The ciphertext string is: " + caesarCode(str));
    }

    public static String caesarCode(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = (char) (str.charAt(i) + 3);
            result.append(ch);
        }
        return result.toString();
    }
}
