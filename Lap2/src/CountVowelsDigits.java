import java.util.Locale;
import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.next().toLowerCase();
        int inStrLen = inStr.length();

        int numVowel = 0;
        int numDigit = 0;

        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            char ch = inStr.charAt(charIdx);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                numVowel++;
            }
            if (ch >= '0' & ch <= '9') {
                numDigit++;
            }
        }
        double percentsOfVowels = (numVowel * 100.0 / inStrLen);
        double percentsOfDigits = (numDigit * 100.0 / inStrLen);
        System.out.println(percentsOfVowels);
        System.out.printf("Number of vowels : %d (%2.2f%%) \nNumber of digits : %d (%2.2f%%)", numVowel, percentsOfVowels, numDigit, percentsOfDigits);
    }
}
