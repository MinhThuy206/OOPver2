public class SumAverageRunningInt {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int sum = 0;
        double average;

        for(int number = LOWERBOUND; number<= UPPERBOUND; ++number){
            sum += number;
        }
        average = sum / UPPERBOUND;
        System.out.println("The sum of "+ LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
        System.out.println("The average is "+ average);
    }
}
