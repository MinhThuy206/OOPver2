public class SumOfSquares {
    public static void main(String[] args) {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        long sum = 0;
        for(int number = LOWERBOUND; number<=UPPERBOUND; ++ number ){
            sum += number * number;
        }
        System.out.println("The sum is " + sum);
    }
}
