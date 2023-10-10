import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The result is: "+ len(n));
    }

    public static String len(int n){
        String str= "";
        if(n == 0){
            return str+ 0;
        }else if(n == 1){
            return str+ 1;
        }
        return str + len(n-1) + n;
    }
}
