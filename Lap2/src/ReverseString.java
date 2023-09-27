import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = sc.next();

        System.out.println("The reverse of the String " + inStr + " is " + reverseStr(inStr));
    }

    public static String reverseStr(String inStr) {
        int inStrLen = inStr.length();
        String outStr = "";

        for (int charIdx = inStrLen - 1; charIdx >= 0; charIdx--) {
            outStr += inStr.charAt(charIdx);
        }
        return outStr;
    }
}
