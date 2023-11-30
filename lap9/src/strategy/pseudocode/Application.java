package strategy.pseudocode;


import java.util.Objects;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Context context = new Context();
        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter the desired action: ");
        String action = sc.next();

        if(Objects.equals(action, "+")){
            context.setStrategy(new ConcreteStrategyAdd());
        }
        if(Objects.equals(action, "-")){
            context.setStrategy(new ConcreteStrategySubtract());
        }
        if(Objects.equals(action, "x")){
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        double result = context.executeStrategy(a, b);
        System.out.println("The result is: "+result);
    }
}
