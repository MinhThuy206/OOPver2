import java.util.Scanner;
public class CheckHexStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String inStr = sc.next().toLowerCase();
        int inStrLen = inStr.length();
        boolean check = false;
        for(int charIdx = 0; charIdx < inStrLen; charIdx++){
            char ch = inStr.charAt(charIdx);
            if(!((ch >= '0' && ch <= '9') || ch >= 'a' && ch <= 'f')){
                check = false;
            }else{
                check = true;
            }
        }
        if(check){
            System.out.println(inStr + " is a hex string");
        }else{
            System.out.println(inStr + " is not a string");
        }
    }
}
