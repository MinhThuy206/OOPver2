import java.util.Scanner;

public class Bin2Dec {
    final static String DEC_STRING = "0123456789";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Binary string: ");
        String str = sc.next();
        if (isBinaryNum(str))
            System.out.printf("The equivalent decimal for binary '%s' is:  %d",str,  binToDec(str));
        else {
            System.out.printf("error: invalid binary string '%s'", str);
        }
    }

    public static boolean isBinaryNum(String str) {
        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            char ch = str.charAt(i);
            if (ch != '0' & ch != '1') {
                return false;
            }
        }
        return true;
    }

    public static int binToDec(String input) {
        int decimalNumber = 0;
        for (int i = 0; i < input.length(); i++) {
            char digit = input.charAt(i);
            int digitValue = DEC_STRING.indexOf(digit);
            decimalNumber = decimalNumber * 2 + digitValue;
        }
        return decimalNumber;
    }
}
