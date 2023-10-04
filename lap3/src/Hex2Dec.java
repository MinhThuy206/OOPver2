import java.util.Locale;
import java.util.Scanner;

public class Hex2Dec {

    final static String DEX_STRING = "0123456789ABCDEF";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String str = sc.next().toUpperCase(Locale.ROOT);
        if (isHexadecimal(str))
            System.out.printf("The equivalent decimal for hexadecimal '%s' is:  %d", str, hexToDec(str));
        else {
            System.out.printf("error: invalid hexadecimal string '%s'", str);
        }
    }

    public static boolean isHexadecimal(String str) {
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            char ch = str.charAt(i);
            if (!((ch >= '0' && ch <= '9') || ch >= 'A' && ch <= 'F')) {
                return false;
            }
        }
        return true;
    }

    public static int hexToDec(String input) {
        int decimalNumber = 0;
        for (int i = 0; i < input.length(); i++) {
            char digit = input.charAt(i);
            int digitValue = DEX_STRING.indexOf(digit);
            decimalNumber = decimalNumber * 16 + digitValue;
        }
        return decimalNumber;
    }
}
