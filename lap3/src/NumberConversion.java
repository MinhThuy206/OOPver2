import java.util.Locale;
import java.util.Scanner;

public class NumberConversion {

    final static String HEX_STRING = "0123456789ABCDEF";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String inStr = scanner.nextLine();
        String input = inStr.toUpperCase(Locale.ROOT);

        System.out.print("Enter the input radix: ");
        int inRadix = scanner.nextInt();

        System.out.print("Enter the output radix: ");
        int ouRadix = scanner.nextInt();

        if (isValidInput(input, inRadix) && isValidBase(inRadix) && isValidBase(ouRadix)) {
            String result = Dec2Radix(Radix2Dec(input, inRadix), ouRadix);
            System.out.printf("'%s' in radix %d is '%s' in radix %d", inStr, inRadix, result, ouRadix);
        } else {
            System.out.println("Invalid input");
        }
    }

    // Hàm kiểm tra xem đầu vào có hợp lệ không
    public static boolean isValidInput(String input, int base) {
        for (int i = 0; i < input.length(); i++) {
            char digit = input.charAt(i);
            if (HEX_STRING.indexOf(digit) == -1 || digit >= HEX_STRING.charAt(base-1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidBase(int base) {
        return base >= 2 && base <= 16;
    }

    public static int Radix2Dec(String input, int inRadix) {
        int decimalNumber = 0;
        for (int i = 0; i < input.length(); i++) {
            char digit = input.charAt(i);
            int digitValue = HEX_STRING.indexOf(digit);
            decimalNumber = decimalNumber * inRadix + digitValue;
        }
        return decimalNumber;
    }

    public static String Dec2Radix(int num, int ouRadix) {
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            int remainder = num % ouRadix;
            char digit = HEX_STRING.charAt(remainder);
            result.insert(0, digit);
            num /= ouRadix;
        }
        return result.toString();
    }
}
