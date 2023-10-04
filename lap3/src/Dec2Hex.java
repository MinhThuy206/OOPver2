import java.util.Scanner;

public class Dec2Hex {
    final static String HEX_STRING = "0123456789ABCDEF";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        StringBuilder hex = dec2Hex(num);
        System.out.print("The equivalent hexadecimal number is ");
        reverseString(hex);
    }

    public static StringBuilder dec2Hex(int num) {
        StringBuilder hex = new StringBuilder();
        int n;
        while (num > 0) {
            n = num % 16;
            hex.append(HEX_STRING.charAt(n));

            num = num / 16;
        }
        return hex;
    }

    public static void reverseString(StringBuilder hex) {
        for (int i = hex.length() - 1; i >= 0; i--) {
            System.out.print(hex.charAt(i));
        }
    }
}
