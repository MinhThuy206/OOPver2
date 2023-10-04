import java.util.Scanner;

public class Hex2Bin {
    final static String[] HEX_BITS = {"0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"};

    final static String HEX_String = "0123456789abcdef";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String str = sc.next().toLowerCase();
        if (check(str)) {
            System.out.printf("The equivalent binary for hexadecimal '%s' is: %s", str, hex2Bin(str));
        } else {
            System.out.println("Invalid");
        }
    }

    public static String hex2Bin(String str) {
        String results = " ";
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            char ch = str.charAt(i);
            int digit = HEX_String.indexOf(ch);
            results += HEX_BITS[digit] + " ";
        }
        return results;
    }

    public static boolean check(String str) {
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            int bit = HEX_String.indexOf(str.charAt(i));
            if (bit == -1) {
                return false;
            }
        }
        return true;
    }
}
