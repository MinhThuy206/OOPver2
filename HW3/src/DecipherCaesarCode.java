import java.util.Locale;
import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String str = in.next().toUpperCase(Locale.ROOT);
        System.out.println("The plaintext string is: " + deCaesarCode(str));
    }

    public static String deCaesarCode(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = (char) (str.charAt(i) - 3);
            result.append(ch);
        }
        return result.toString();
    }
}

