import java.util.Scanner;

public class Dec2RadixN {
    final static String HEX_STRING = "0123456789ABCDEF";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        System.out.print("Enter a radix: ");
        int radix = sc.nextInt();
        StringBuilder result = decToRadix(num, radix);
        System.out.print("The equivalent hexadecimal number is ");
        reverseString(result);
    }

    public static StringBuilder decToRadix(int num, int radix) {
        StringBuilder hex = new StringBuilder();
        int n;
        while (num > 0) {
            n = num % radix;
            hex.append(HEX_STRING.charAt(n));
            num = num / radix;
        }
        return hex;
    }

    public static void reverseString(StringBuilder hex) {
        for (int i = hex.length() - 1; i >= 0; i--) {
            System.out.print(hex.charAt(i));
        }
    }
}
