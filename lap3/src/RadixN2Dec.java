import java.util.Scanner;

public class RadixN2Dec {
    final static String HEX_STRING = "0123456789ABCDEF";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = sc.nextInt();
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.printf("The equivalent decimal '%s' is: %d",str, Radix2Dec(str, radix));

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
}
