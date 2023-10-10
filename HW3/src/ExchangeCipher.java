import java.util.Locale;
import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String str = in.next().toUpperCase(Locale.ROOT);
        System.out.println("The ciphertext string is: " + exchangeCode(str));
    }

    public static String exchangeCode(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = (char) ('A' + 'Z' - str.charAt(i));
            result.append(ch);
        }
        return result.toString();
    }
}

